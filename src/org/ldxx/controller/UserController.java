package org.ldxx.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ldxx.bean.User;
import org.ldxx.dao.UserDao;
import org.ldxx.service.UserService;
import org.ldxx.util.TimeUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * 人员用户管理
 * @author hp
 *
 */
@RequestMapping("user")
@Controller
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/addUser")
	@ResponseBody
	public Map<String,Object> addUser(User user){
		Map<String,Object> map=new HashMap<>();
		TimeUUID uuid=new TimeUUID();
		String id=uuid.getTimeUUID();
		user.setUserId(id);
		
		int i = userservice.countOfusername(user.getUsername());
		if(i>0){/*用户名已存在*/
			i= -2;
		}else{
			i = userservice.addUser(user);
		}
		map.put("result", i);
		map.put("user", user);
		return map;
	}
	
	@RequestMapping("/deleteUser")
	@ResponseBody
	public int deleteUser(String userId){
		return userservice.deleteUser(userId);
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public Map<String,Object> updateUser(User user){
		Map<String,Object> map=new HashMap<>();
		String id = user.getUserId();
		
		int i = userservice.countOfusernameEdit(user.getUsername(),user.getUserId());
		if(i>0){/*用户名已存在*/
			i= -2;
		}else{
			i= userservice.updateUser(user);
		}
		map.put("result", i);
		map.put("user", user);
		return map;
	}

	@RequestMapping("/selectAllUser")
	@ResponseBody
	public List<User> selectAllUser(){
		return userservice.selectAllUser();
	}
	
	@RequestMapping("/selectUserById")
	@ResponseBody
	public User selectUserById(String userId){
		return userservice.selectUserById(userId);
	}
	
	@RequestMapping("/updatePasswordById")
	@ResponseBody
	public int updatePasswordById(String userId,String password){
		String old_password = password.split(",")[0];
		String new_password = password.split(",")[1];
		User user = userservice.selectUserById(userId);
		int i=0;
		if(!user.getPassword().equals(old_password)){
			i=-1;
		}else if(user.getPassword().equals(new_password)){
			i=-2;
		}else{
			i=userservice.updatePasswordById(userId,new_password);
		}
		return i;
	}
	
}
