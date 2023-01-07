package com.webModule.webService.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.webModule.webService.data.valuesManger.NullCheckUtill;
import com.webModule.webService.exception.GlobalExeptionHandler;
import com.webModule.webService.vo.HumanResource;

@Service
public class BasicResponseService {
	
	HumanResource humanResource;
	
	@Autowired
	GlobalExeptionHandler globalExeptionHandler;
	@Autowired
	private final JwtManagerService jwtManagerService;
	private String jwtToken = "";
	
	@Autowired
	public BasicResponseService() {
		this.jwtManagerService = null;
		this.humanResource = new HumanResource();
	}
	
	public ResponseEntity<?> extractParameterHumanResource(String url) {
		@SuppressWarnings("unchecked")
		ArrayList<HashMap<String, Object>> map = (ArrayList<HashMap<String, Object>>)DtoService.getData().get("result");
		Object vo;
		ResponseEntity<?> response = new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
		try {
			vo = AutoInputService.autoInputVoService(humanResource.getClass(),map);
			if(vo != null) humanResource = (HumanResource)vo;
		} catch (NoSuchMethodError | IllegalAccessException | InstantiationException | InvocationTargetException
				| NoSuchFieldException | SecurityException | IllegalArgumentException | NoSuchMethodException e) {			
			return globalExeptionHandler.handleNoSuchElementFoundException(e);			
		}
		if(!"".equals(url)) {
			if(url.endsWith("signIn")) {
				response = sendAccessToken();
			}
		} 
		return response;					
	}
	
	public ResponseEntity<?> sendAccessToken() {
		HashMap<String, Object> returnValue = new HashMap<>();
		String loginID = humanResource.getLoginID();
		String passwrd = humanResource.getPassword();
		
		NullCheckUtill nullChk = new NullCheckUtill();
		if(nullChk.NullCheck(loginID)) {				
			Exception e = new Exception("loginID is Null.");
			return globalExeptionHandler.handleNoSuchElementFoundException(e);
		} 
		if(nullChk.NullCheck(passwrd)) {				
			Exception e = new Exception("passwrd is Null.");
			return globalExeptionHandler.handleNoSuchElementFoundException(e);
		}
		
		jwtToken = jwtManagerService.generateToken(loginID, passwrd);
		returnValue.put("accessToken", jwtToken);
		return new ResponseEntity<HashMap<String, Object>>(returnValue, HttpStatus.OK);
	}
	
	public ResponseEntity<?> extractJwt() {
		@SuppressWarnings("unchecked")
		ArrayList<HashMap<String, Object>> map = (ArrayList<HashMap<String, Object>>)DtoService.getData().get("result");
		HashMap<String, Object> returnValue = new HashMap<>();
		try {
			Object tokenInfo = jwtManagerService.getTokenInfo(map.get(0).get("result").toString());
			returnValue.put("result", tokenInfo);
		} catch (Exception e) {			
			return globalExeptionHandler.handleNoSuchElementFoundException(e);
		}
		return new ResponseEntity<HashMap<String, Object>>(returnValue, HttpStatus.OK);
	}
	
	public ResponseEntity<?> extractReqeustBodyHumanResource() {
		@SuppressWarnings("unchecked")
		ArrayList<HashMap<String, Object>> map = (ArrayList<HashMap<String, Object>>)DtoService.getData().get("result");
		Object vo;
		try {
			vo = AutoInputService.autoInputVoService(humanResource.getClass(),map);
			if(vo != null) humanResource = (HumanResource)vo;
			System.out.println(humanResource.toString());
		} catch (NoSuchMethodError | IllegalAccessException | InstantiationException | InvocationTargetException
				| NoSuchFieldException | SecurityException | IllegalArgumentException | NoSuchMethodException e) {			
			return globalExeptionHandler.handleNoSuchElementFoundException(e);
			
		}
		return new ResponseEntity<String>("SUCCESS", HttpStatus.OK);
	}
}
