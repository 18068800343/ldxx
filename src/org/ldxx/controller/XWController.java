package org.ldxx.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.ldxx.bean.XW;
import org.ldxx.service.XWService;
import org.ldxx.util.TimeUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/xw")
@Controller
public class XWController {
	
	@Autowired
	private XWService service;
	
	@RequestMapping("/getAllXW")
	@ResponseBody
	public List<XW> getAllXW(){
		return service.getAllXW();
	}
	
	@RequestMapping("/getXWById")
	@ResponseBody
	public XW getXWById(String id){
		return service.getXWById(id);
	}
	
	@RequestMapping("/getlimitXW")//只查最新几条数据
	@ResponseBody
	public List<XW> getlimitXW(int num){
		return service.getlimitXW(num);
	}
	
	@RequestMapping("/addXW")
	@ResponseBody
	public Map<String,Object> addXW(XW xw){
		Map<String,Object> map=new HashMap<>();
		TimeUUID uuid = new TimeUUID();
		String id = uuid.getTimeUUID();
		xw.setXwId(id);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date = df.format(new Date());// new Date()为获取当前系统时间
		xw.setXwDate(date);
		int i=service.addXW(xw);
		map.put("result", i);
		map.put("xw", xw);
		return map;
	}
	
	@RequestMapping("/deleteXW")
	@ResponseBody
	public int deleteXW(String id){
		return service.deleteXW(id);
	}
	
	@RequestMapping("/updateXWbyId")
	@ResponseBody
	public Map<String,Object> updateXWbyId(XW xw){
		Map<String,Object> map=new HashMap<>();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date = df.format(new Date());// new Date()为获取当前系统时间
		xw.setXwDate(date);
		int i=service.updateXWbyId(xw);
		map.put("result", i);
		map.put("xw", xw);
		return map;
	}

}
