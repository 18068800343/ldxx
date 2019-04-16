package org.ldxx.service;

import java.util.List;

import org.ldxx.bean.Lx;

public interface LxService {

	int addLx(Lx lx);

	int delLx(String id);

	int updateLx(Lx lx);

	List<Lx> getLx();

}
