package org.ldxx.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ldxx.bean.Lx;
import org.ldxx.service.LxService;
import org.ldxx.util.TimeUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 联系我们
 * @author hp
 *
 */

@RequestMapping("lx")
@Controller
public class LxController {
	
	@Autowired
	private LxService service;
	
	@RequestMapping("/addLx")
	@ResponseBody
	public Map<String,Object> addLx(Lx lx){
		Map<String,Object> map=new HashMap<>();
		TimeUUID uuid = new TimeUUID();
		String id = uuid.getTimeUUID();
		lx.setLxId(id);
		int i=service.addLx(lx);
		map.put("result", i);
		map.put("lx", lx);
		return map;
	}
	
	@RequestMapping("/delLx")
	@ResponseBody
	public int delLx(String id){
		return service.delLx(id);
	}
	
	@RequestMapping("/updateLx")
	@ResponseBody
	public Map<String,Object> updateLx(Lx lx){
		Map<String,Object> map=new HashMap<>();
		int i=service.updateLx(lx);
		map.put("result", i);
		map.put("lx", lx);
		return map;
	}
	
	@RequestMapping("/getLx")
	@ResponseBody
	public List<Lx> getLx(){
		return service.getLx();
	}

}
