package com.webModule.webService.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.webModule.webService.exception.GlobalExeptionHandler;
import com.webModule.webService.vo.HumanResourceVo;

@Service
public class mainPageService {
	
	HumanResourceVo hVo;
	
	@Autowired
	GlobalExeptionHandler globalExeptionHandler;
	
	@Autowired
	public mainPageService() {
		this.hVo = new HumanResourceVo();
	}
	
	
	public ResponseEntity<?> extractMapData() {
		@SuppressWarnings("unchecked")
		ArrayList<HashMap<String, Object>> map = (ArrayList<HashMap<String, Object>>)dtoService.getData().get("result");
		Object vo;
		try {
			vo = autoInputService.autoInputVoService(hVo.getClass(),map);
			if(vo != null) hVo = (HumanResourceVo)vo;
			System.out.println(hVo.toString());
		} catch (NoSuchMethodError | IllegalAccessException | InstantiationException | InvocationTargetException
				| NoSuchFieldException | SecurityException | IllegalArgumentException | NoSuchMethodException e) {			
			return globalExeptionHandler.handleNoSuchElementFoundException(e);
			
		}
		return new ResponseEntity<String>(hVo.toString(), HttpStatus.OK);
	}
}
