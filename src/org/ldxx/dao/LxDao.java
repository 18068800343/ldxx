package org.ldxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ldxx.bean.Lx;

public interface LxDao {

	int addLx(@Param("lx")Lx lx);

	int delLx(@Param("id")String id);

	int updateLx(@Param("lx")Lx lx);

	List<Lx> getLx();

}
