package com.xxl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xxl.model.UserT;
import com.xxl.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping("/showUser")
	public UserT toIndex(HttpServletRequest request,Model model){
		
//		int userId = Integer.parseInt(request.getParameter("id"));
		UserT user = this.userservice.getUserById(1);
		model.addAttribute("user", user);
		return user;
	}
	
	
}
