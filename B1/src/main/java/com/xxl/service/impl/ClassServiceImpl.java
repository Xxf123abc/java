package com.xxl.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xxl.dao.ClassMapper;
import com.xxl.model.po.Class;
import com.xxl.service.ClassService;


@Service("classService")
public class ClassServiceImpl implements ClassService{
	
	@Autowired
	private ClassMapper classDao;

	public Map<String, Object> selectClass(int id) {
		
		return classDao.getClass(id);
	}

	public List<Map<String,Object>> selectClass2() {
		return classDao.getClass2();
	}

}
