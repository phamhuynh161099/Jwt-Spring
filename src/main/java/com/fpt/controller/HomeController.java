package com.fpt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class HomeController {
	@GetMapping("index")
	public String index() {
		return "index";
	}

	@GetMapping("login")
	public String login() {
		return "login";
	}

//	@PostMapping("/login-success")
//	public String loginSuccess(Authentication authentication) {
//		System.out.println("Nameeeeeeeeeeeeeeeeeeeeeee:  "+authentication.getName());
//		return "redirect:/api/test1";
//				
//	}
	@PostMapping("sign")
	public void signin() {
		System.out.println("Nameeeeeeeeeeeeeeeeeeeeeee:  ");
	}
}