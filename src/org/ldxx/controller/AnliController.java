package org.ldxx.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ldxx.bean.Anli;
import org.ldxx.service.AnliService;
import org.ldxx.util.TimeUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("anli")
@Controller
public class AnliController {
	
	@Autowired
	private AnliService service;
	
	@RequestMapping("/getAllanli")
	@ResponseBody
	public List<Anli> getAllanli(){
		List<Anli> list=service.getAllanli();
		return list;
	}
	
	@RequestMapping("/getanliById")
	@ResponseBody
	public Anli getanliById(String id){
		Anli anli=service.getanliById(id);
		return anli;
	}
	
	@RequestMapping("/getLimitanli")
	@ResponseBody
	public List<Anli> getLimitanli(String num){
		List<Anli> anli=service.getLimitanli(num);
		return anli;
	}
	
	@RequestMapping("/addanli")
	@ResponseBody
	public Map<String,Object> addanli(Anli anli){
		Map<String,Object> map=new HashMap<>();
		TimeUUID uuid = new TimeUUID();
		String id = uuid.getTimeUUID();
		anli.setAlId(id);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date = df.format(new Date());// new Date()为获取当前系统时间
		anli.setAlDate(date);
		int i=service.addanli(anli);
		map.put("result", i);
		map.put("anli", anli);
		return map;
	}
	
	@RequestMapping("/delAnliById")
	@ResponseBody
	public int delAnliById(String id){
		return service.delAnliById(id);
	}
	
	@RequestMapping("/updateAnliById")
	@ResponseBody
	public Map<String,Object> updateAnliById(Anli anli){
		Map<String,Object> map=new HashMap<>();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String date = df.format(new Date());// new Date()为获取当前系统时间
		anli.setAlDate(date);
		int i=service.updateAnliById(anli);
		map.put("result", i);
		map.put("anli", anli);
		return map;
	}

}
