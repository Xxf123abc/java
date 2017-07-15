package com.xxl.dao;
import java.util.List;
import java.util.Map;

import com.xxl.model.po.Class;
public interface ClassMapper {
	Map<String, Object> getClass(int id);
	List<Map<String,Object>> getClass2();
}
