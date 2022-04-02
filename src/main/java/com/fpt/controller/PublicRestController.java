package com.fpt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PublicRestController {
	
	
	@GetMapping("/test1")
	public String test1() {
		return "api test 1";
	}

	@GetMapping("/test2")
	public String test2() {
		return "api test 3";
	}

	@GetMapping("/test3")
	public String test3() {
		return "api test 3";
	}

}
