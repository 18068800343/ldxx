package org.ldxx.service;

import java.util.List;
import java.util.Map;

import org.ldxx.bean.XW;

public interface XWService {

	List<XW> getAllXW();

	int addXW(XW xw);

	int deleteXW(String id);

	int updateXWbyId(XW xw);

	List<XW> getlimitXW(int num);

	XW getXWById(String id);


}
