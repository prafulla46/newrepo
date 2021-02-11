package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping("/login123")
	public String hello() {
		System.out.println("login is called");
		return "hello";
	}
	
	@GetMapping("/gjly")
	public String hello1() {
		System.out.println("gjly is called");
		return "hello1";
	}
	@GetMapping("/mbmbm")
	public String hello2() {
		System.out.println("mbmbm is called");
		return "hello2";
	}
	@GetMapping("/srs")
	public String hello3() {
		System.out.println("srs is called");
		return "hello";
	}

}
