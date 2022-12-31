package com.webModule.webService.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.webModule.webService.data.service.DataParsingUtill;


public class DtoService {
	private static String strTest = "";
	private static Integer intTest = 0;
	private static Float floatTest = 0f;
	private static DataParsingUtill dUtill = new DataParsingUtill(strTest,intTest,floatTest);
	private static HashMap<String, Object> data;
	
	private static final Logger log = LoggerFactory.getLogger(DtoService.class);
	public static HashMap<String, Object> dtoClass(HashMap<String, Object> reqBody) {
		 HashMap<String, Object> resultBody = new HashMap();
		 ArrayList<HashMap<String, Object>> result = new ArrayList();
		try {
			Object rawData;
			Set s = reqBody.keySet();
			Iterator ie = s.iterator();
			while (ie.hasNext()) {
				HashMap<String, Object> element = new HashMap();
				String key = (String)ie.next();
				rawData = reqBody.get(key);
				if(rawData.getClass().getSimpleName().equals("String")) {
					dUtill.GetData((String)rawData);
					intTest = Integer.valueOf(DataParsingUtill.getReturnData().get("Integer").toString());	
					floatTest = Float.valueOf(DataParsingUtill.getReturnData().get("Float").toString());	
					Object value;
					if(intTest != 0) {							
						value = intTest;
						intTest = Integer.valueOf(dUtill.SetData().toString());
						element.put(key, value);
					} else if(floatTest != 0){
						value = floatTest;
						floatTest = Float.valueOf(dUtill.SetData().toString());
						element.put(key, value);
					} else {
						if(DataParsingUtill.getReturnData().get("String").toString().equals(null)) {
							element.put(key, intTest);
						} else {
							strTest = dUtill.SetData().toString();					
							element.put(key, strTest);							
						}
					}
					result.add(element);
					
				} else if(rawData.getClass().getSimpleName().equals("Integer")) {
					dUtill.GetData((Integer)rawData);
					intTest = Integer.valueOf(dUtill.SetData().toString());
					element.put(key, intTest);
					result.add(element);
					
				} else if(rawData.getClass().getSimpleName().equals("Float")) {
					dUtill.GetData((Float)rawData);
					floatTest = Float.valueOf(dUtill.SetData().toString());
					element.put(key, floatTest);
					result.add(element);
				}						
			}
			resultBody.put("result", result);
			setData(resultBody);
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return resultBody;
	}
	public static HashMap<String, Object> getData() {
		return data;
	}
	public static void setData(HashMap<String, Object> data) {
		DtoService.data = data;
	}
}
