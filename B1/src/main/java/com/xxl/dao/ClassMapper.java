package com.xxl.dao;

import java.util.List;
import java.util.Map;

import com.xxl.model.Class;

public interface ClassMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);

	Map<String, Object> getClass(int id);

	List<Map<String, Object>> getClass2();
}