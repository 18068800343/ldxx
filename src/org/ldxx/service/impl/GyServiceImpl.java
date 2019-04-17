package org.ldxx.service.impl;

import java.util.List;

import org.ldxx.bean.Gy;
import org.ldxx.dao.GyDao;
import org.ldxx.service.GyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GyServiceImpl implements GyService {
	
	@Autowired
	private GyDao dao;

	@Override
	public List<Gy> getGy() {
		return dao.getGy();
	}

	@Override
	public int addGy(Gy gy) {
		return dao.addGy(gy);
	}

	@Override
	public int delGy(String id) {
		return dao.delGy(id);
	}

	@Override
	public int updateGy(Gy gy) {
		return dao.updateGy(gy);
	}

}
