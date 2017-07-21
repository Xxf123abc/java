package com.xxl.test;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.xxl.model.UserT;
import com.xxl.service.ClassService;
import com.xxl.service.UserService;
import com.xxl.model.po.Class;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMyBatis {

	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ClassService classService;
	
	@Test
	public void test1(){
		UserT user = userService.getUserById(1);
		System.out.println(user.getUserName());
		logger.info(JSON.toJSONString(user));  
	}
	@Test
	public void test2(){
		UserT user = new UserT();
		user.setAge(13);
		user.setId(2);
		user.setPassword("122");
//		user.setUserName("xxl");
		userService.addUser(user);
	}
	@Test
	public void test3(){
		UserT user = new UserT();
		user.setAge(13);
		user.setId(2);
		user.setPassword("122");
		userService.inset(user);
	}
	
	@Test
	public void test4(){
		UserT u= new UserT();
		UserT user = userService.selectUserById(u.getId());
		System.out.println(user.getUserName());
		logger.info(JSON.toJSONString(user));
	}
	
	@Test
	public void test5(){
		Map<String, Object> map = classService.selectClass(1);
		System.out.println(map);
	}
	
	@Test
	public void test6(){
		List<Map<String,Object>> list = classService.selectClass2();
		System.out.println(list);
	}
	
}
