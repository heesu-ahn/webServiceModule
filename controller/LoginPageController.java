package com.webModule.webService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webModule.webService.service.BasicResponseService;

@RestController
@RequestMapping("/logIn")
public class LoginPageController {
	
	@Autowired
	BasicResponseService responseService;
	
	@GetMapping("/signIn")
	public void getInfo() {
		
	}
	
	@PostMapping("/signUp")
	public ResponseEntity<?> setInfo() {
		return responseService.extractHumanMapData();
	}
	
	@PostMapping("/auth")
	public void getAuthorization() {
		return;
	}
	
}
