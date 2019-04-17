package org.ldxx.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ldxx.bean.Gy;
import org.ldxx.service.GyService;
import org.ldxx.util.TimeUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("gy")
@Controller
public class GyController {
	
	@Autowired
	private GyService service;
	
	@RequestMapping("/getGy")
	@ResponseBody
	public List<Gy> getGy(){
		return service.getGy();
	}
	
	@RequestMapping("/addGy")
	@ResponseBody
	public Map<String,Object> addGy(Gy gy){
		Map<String,Object> map=new HashMap<>();
		TimeUUID uuid = new TimeUUID();
		String id = uuid.getTimeUUID();
		gy.setGyId(id);
		int i=service.addGy(gy);
		map.put("result", i);
		map.put("gy", gy);
		return map;
	}
	
	@RequestMapping("/delGy")
	@ResponseBody
	public int delGy(String id){
		return service.delGy(id);
	}
	
	@RequestMapping("/updateGy")
	@ResponseBody
	public Map<String,Object> updateGy(Gy gy){
		Map<String,Object> map=new HashMap<>();
		int i=service.updateGy(gy);
		map.put("result", i);
		map.put("gy", gy);
		return map;
	}

}
