package com.xxl.service;
import java.util.List;
import java.util.Map;

import com.xxl.model.po.Class;

public interface ClassService {

	Map<String, Object> selectClass(int id);
	List<Map<String,Object>> selectClass2();
}
