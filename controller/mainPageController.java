package com.webModule.webService.controller;


import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webModule.webService.exception.GlobalExeptionHandler;
import com.webModule.webService.interceptor.requestInterceptor;
import com.webModule.webService.service.autoInputService;
import com.webModule.webService.service.dtoService;
import com.webModule.webService.service.mainPageService;
import com.webModule.webService.vo.HumanResourceVo;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/main")
public class mainPageController {
	
	private static final Logger log = LoggerFactory.getLogger(mainPageController.class);
	
	@Autowired
	mainPageService mainPageService;
	
	@GetMapping("/user")
	public void getInfo() {
		
	}
	
	@PostMapping("/user")
	public ResponseEntity<?> setInfo() {
		return mainPageService.extractMapData();
	}
	
	@PostMapping("/auth")
	public void getAuthorization() {
		return;
	}
	
}
