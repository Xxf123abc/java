package com.fuiou.xxl.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fuiou.xxl.service.GreetingService;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-application.xml");
		context.start();
		System.in.read(); 
	}

}
