package org.ldxx.service;

import java.util.List;

import org.ldxx.bean.Anli;

public interface AnliService {

	List<Anli> getAllanli();

	Anli getanliById(String id);

	int addanli(Anli anli);

	int delAnliById(String id);

	int updateAnliById(Anli anli);

	List<Anli> getLimitanli(String num);


}
