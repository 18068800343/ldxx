package org.ldxx.service.impl;

import java.util.List;

import org.ldxx.bean.Lx;
import org.ldxx.dao.LxDao;
import org.ldxx.service.LxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LxServiceImpl implements LxService {

	@Autowired
	private LxDao dao;

	@Override
	public int addLx(Lx lx) {
		return dao.addLx(lx);
	}

	@Override
	public int delLx(String id) {
		return dao.delLx(id);
	}

	@Override
	public int updateLx(Lx lx) {
		return dao.updateLx(lx);
	}

	@Override
	public List<Lx> getLx() {
		return dao.getLx();
	}
	
}
