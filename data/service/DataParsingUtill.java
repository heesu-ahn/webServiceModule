package com.webModule.webService.data.service;

import java.util.HashMap;

import com.webModule.webService.data.valuesManger.ObjectObserverUtill;
import com.webModule.webService.data.valuesManger.ObjectObserverUtill.ObjectObserver;

public class DataParsingUtill extends StringUtill {
	
	private ObjectObserverUtill obsUtill;
	private ObjectObserver objectObserver;
	public static LoggingService logSvc = new LoggingService(DataParsingUtill.class,""); 
	private static HashMap<String, Object> returnData;
	public DataParsingUtill(String str, Integer intNum, Float floatNum) {
		super(str, intNum, floatNum);
		setReturnData(ReturnValue());
		obsUtill = new ObjectObserverUtill();
		objectObserver = obsUtill.observer;
	}
	public void GetData(String data) {
		if(data == null) {
			GetData((Object)data,"String");
		} else {			
			GetData((Object)data,data.getClass().getSimpleName());
		}
	}
	public void GetData(Integer data) {
		GetData((Object)data,data.getClass().getSimpleName());
	}
	public void GetData(Float data) {
		GetData((Object)data,data.getClass().getSimpleName() );
	}
	public void GetData(Character data) {
		GetData((Object)data,data.getClass().getSimpleName() );
	}
	private void GetData(Object data, Object dataType) {
		if(dataType == null) return;
		String type = dataType.toString();
		SanitizeVariables();
		if(data != null) logSvc.setMessage(String.format("Input Data >>> [%s] [%s]", type,data),this);
		IsNullOrEmpty(data);
		setReturnData(ReturnValue());
	}
	public Object SetData() {
		if(returnType.equals("String")) {objectObserver.setStrObj(getReturnData().get(returnType).toString());}
		else if(returnType.equals("Integer")) {objectObserver.setIntObj(Integer.valueOf(getReturnData().get(returnType).toString()));}
		else if(returnType.equals("Float")) {objectObserver.setFloatObj(Float.valueOf(getReturnData().get(returnType).toString()));}
		return getReturnData().get(returnType);
	}
	public static HashMap<String, Object> getReturnData() {
		return returnData;
	}
	public static void setReturnData(HashMap<String, Object> returnData) {
		DataParsingUtill.returnData = returnData;
	}
	
	

}
