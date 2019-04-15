package org.ldxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ldxx.bean.Anli;

public interface AnliDao {

	List<Anli> getAllanli();

	Anli getanliById(@Param("id")String id);

	int addanli(@Param("anli")Anli anli);

	int delAnliById(@Param("id")String id);

	int updateAnliById(@Param("anli")Anli anli);

	List<Anli> getLimitanli(@Param("num")String num);

}
