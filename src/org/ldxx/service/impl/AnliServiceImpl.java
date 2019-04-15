package org.ldxx.service.impl;

import java.util.List;

import org.ldxx.bean.Anli;
import org.ldxx.dao.AnliDao;
import org.ldxx.service.AnliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AnliServiceImpl implements AnliService {
	
	@Autowired
	private AnliDao dao;

	@Override
	public List<Anli> getAllanli() {
		return dao.getAllanli();
	}

	@Override
	public Anli getanliById(String id) {
		return dao.getanliById(id);
	}

	@Override
	public int addanli(Anli anli) {
		return dao.addanli(anli);
	}

	@Override
	public int delAnliById(String id) {
		return dao.delAnliById(id);
	}

	@Override
	public int updateAnliById(Anli anli) {
		return dao.updateAnliById(anli);
	}

	@Override
	public List<Anli> getLimitanli(String num) {
		return dao.getLimitanli(num);
	}

}
