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
	
	@GetMapping("/signIn") // id & password 로 jwt 를 생성
	public ResponseEntity<?> getInfo() {
		return responseService.extractParameterHumanResource("signIn");
	}
	
	@PostMapping("/signUp") // 사용자 정보 저장 후 id & password 로 jwt 를 생성
	public ResponseEntity<?> setInfo() {
		return responseService.extractReqeustBodyHumanResource();
	}
	
	@PostMapping("/auth") // signIn 이후 Authrization 인증키로 세션을 관리
	public ResponseEntity<?> getAuthorization() {
		return responseService.extractJwt("auth");
	}
	
}
