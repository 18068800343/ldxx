package org.ldxx.service.impl;

import java.util.List;
import java.util.Map;

import org.ldxx.bean.XW;
import org.ldxx.dao.XWDao;
import org.ldxx.service.XWService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class XWServiceImpl implements XWService {
	
	@Autowired
	private XWDao dao;

	@Override
	public List<XW> getAllXW() {
		return dao.getAllXW();
	}

	@Override
	public int addXW(XW xw) {
		return dao.addXW(xw);
	}

	@Override
	public int deleteXW(String id) {
		return dao.deleteXW(id);
	}

	@Override
	public int updateXWbyId(XW xw) {
		return dao.updateXWbyId(xw);
	}

	@Override
	public List<XW> getlimitXW(int num) {
		return dao.getlimitXW(num);
	}

	@Override
	public XW getXWById(String id) {
		return dao.getXWById(id);
	}


}
