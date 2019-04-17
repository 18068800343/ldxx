package org.ldxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ldxx.bean.Gy;

public interface GyDao {

	List<Gy> getGy();

	int addGy(@Param("gy")Gy gy);

	int delGy(@Param("id")String id);

	int updateGy(@Param("gy")Gy gy);

}
