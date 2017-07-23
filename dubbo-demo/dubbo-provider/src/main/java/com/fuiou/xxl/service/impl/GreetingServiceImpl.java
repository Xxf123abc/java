package com.fuiou.xxl.service.impl;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fuiou.xxl.service.GreetingService;



public class GreetingServiceImpl implements GreetingService {

	private static final Log logger = LogFactory.getLog(GreetingServiceImpl.class);
	
	public String hello(String name) {
		
		logger.debug("Hello Service is calling : " + new Date());
		String greetMessage = "Hello, " + name;
		return greetMessage;
	}

}
