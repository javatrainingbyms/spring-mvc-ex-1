package com.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/testing")
	public void test() {
		System.out.println("TESTING SUCCESS.................!!!");
	}
	
	@RequestMapping("/welcome")
	public void testWelcome() {
		System.out.println("WELCOME SUCCESS.................!!!");
	}
}
