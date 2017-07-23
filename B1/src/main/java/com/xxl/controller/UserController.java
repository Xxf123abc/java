package com.xxl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fuiou.xxl.service.GreetingService;
import com.xxl.model.UserT;
import com.xxl.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@Reference
	private GreetingService greetingService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		
//		int userId = Integer.parseInt(request.getParameter("id"));
		String str = this.userservice.getPassWd(1);
		model.addAttribute("user", str);
		return str;
	}
	@RequestMapping("/hello")
	public String helloDubbo(HttpServletRequest request,HttpServletResponse respone){
		
		String name = request.getParameter("name");
		return greetingService.hello(name);
	}
	
	
}
