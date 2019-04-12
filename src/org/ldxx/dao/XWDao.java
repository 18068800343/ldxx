package org.ldxx.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.ldxx.bean.XW;

public interface XWDao {

	List<XW> getAllXW();

	int addXW(@Param("xw")XW xw);

	int deleteXW(@Param("id")String id);

	int updateXWbyId(@Param("xw")XW xw);

	List<XW> getlimitXW(@Param("num")int num);

}
