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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webModule.webService.service.autoInputService;
import com.webModule.webService.service.dtoService;
import com.webModule.webService.vo.HumanResourceVo;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/main")
public class mainPageController {
	@GetMapping("/test")
	public void test() {
		
	}
	
	@PostMapping("/info")
	public void getInfo() {
		extractMapData();
		return;
	}
	
	@PostMapping("/auth")
	public void getAuthorization() {
		return;
	}
	
	
	private void extractMapData() {
		@SuppressWarnings("unchecked")
		ArrayList<HashMap<String, Object>> map = (ArrayList<HashMap<String, Object>>)dtoService.getData().get("result");
		HumanResourceVo hVo = new HumanResourceVo();
		Object vo;
		try {
			vo = autoInputService.autoInputVoService(hVo.getClass(),map);
			if(vo != null) hVo = (HumanResourceVo)vo;
			System.out.println(hVo.toString());
		} catch (NoSuchMethodError | IllegalAccessException | InstantiationException | InvocationTargetException
				| NoSuchFieldException | SecurityException | IllegalArgumentException | NoSuchMethodException e) {
			e.printStackTrace();
		}
		return;
	}
}
