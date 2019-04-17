package org.ldxx.service;

import java.util.List;

import org.ldxx.bean.Gy;

public interface GyService {

	List<Gy> getGy();

	int addGy(Gy gy);

	int delGy(String id);

	int updateGy(Gy gy);

}
