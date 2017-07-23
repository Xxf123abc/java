package com.xxl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fuiou.xxl.service.GreetingService;
import com.xxl.dao.UserTMapper;
import com.xxl.model.UserT;
import com.xxl.model.po.Class;
import com.xxl.service.UserService;

@Service("userService") 
public class UserServiceImpl implements UserService{

	@Autowired
	private UserTMapper userDao;
	@Reference
	private GreetingService greetingService;
	

	public UserT getUserById(int userId) {
		
		return this.userDao.selectByPrimaryKey(userId);  
	}

	public void addUser(UserT u) {
		
		userDao.insert(u);
	}

	public void inset(UserT u) {
		userDao.insertSelective(u);
	}

	public UserT selectUserById(int userId) {
		
		return userDao.selectById(userId);
	}

	public String getPassWd(int id) {
		
		return greetingService.hello("xxl")+this.getUserById(id).getPassword();
	}
	

}
