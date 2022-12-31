package com.webModule.webService.data.service;

import java.util.HashMap;

import com.webModule.webService.controller.LoginPageController;

public class StringUtill {
	
	protected String returnType = "";
	protected String str;
	protected Integer intNum = 0;
	protected Float floatNum = 0f ;
	private HashMap<String, Object> data = new HashMap<>();
	public static LoggingService logSvc = new LoggingService(LoginPageController.class,"");
	StringUtill(String str, Integer intNum, Float floatNum){
		this.str = str;
		this.intNum = intNum;
		this.floatNum = floatNum;

		data.put("String", this.str);
		data.put("Integer", this.intNum);
		data.put("Float", this.floatNum);
		
	}
	public void SanitizeVariables() 
	{
		// resetVariables
		str = null;
		intNum = 0;
		floatNum = 0f;
		// resetDataset
		data.put("String", null);
		data.put("Integer", 0);
		data.put("Float", 0f);
	}
	public HashMap<String, Object> ReturnValue() {
		return data;
	}
	
	
	public Boolean IsNullOrEmpty(Object value){
		Boolean isEmpty = false;
		Boolean isNull = false;
		try {
			str = value.toString();
			returnType = "String";
		} catch (NullPointerException e) {			
			isEmpty = true;
			isNull = true;
			logSvc.setMessage("Exception :: Data is Null.",this);
			returnType = "String";
			str = "";
		}
		finally {
			str = isEmpty ? str : CharToString(value);
			if( !isNull && "".equals(str)) {
				logSvc.setMessage("Exception :: Data is Empty." + " length : [" + value.toString().length() + "]",this);
			}
			if(str != null && str.length() >= 1  && "".equals(str.trim())) {				
				logSvc.setMessage("Exception :: Data is Blank." + " length : [" + value.toString().length() + "]",this);
			}
			isEmpty = "".equals(str);
		}
		
		data.put("String", this.str);
		data.put("Integer", this.intNum);
		data.put("Float", this.floatNum);
		
		return isEmpty;
	}
	public String CharToString(Object value) throws ClassCastException {
		try {
			String isCharString = (String)value;			
		} catch (Exception e) {
			str = String.valueOf(value);
		}
		returnType = "String";
		TryPasseInt(value);
		return str;
	}
	public void TryPasseInt(Object value){
		String backUpStringValue = str;
		try 
		{
			intNum = Integer.parseInt(value.toString());
			if(intNum < 0) {
				str = null;
				returnType = "Integer";
			} else {
				if(!value.toString().equals(intNum) &&  value.toString().length() > 1 && value.toString().substring(0,1).equals("0")) {
					str = value.toString();
					returnType = "String";
					return;
				} else {				
					str = null;
					returnType = "Integer";
				}
			}
		} catch (NumberFormatException e) {
			str = backUpStringValue;
			TryPasseFloat(value);
		}
		return;
	}
	public void TryPasseFloat(Object value){
		String backUpStringValue = str;
		try 
		{
			floatNum = Float.valueOf(value.toString());
			str = null;
			returnType = "Float";
		} catch (NumberFormatException e) {
			str = backUpStringValue;
		}
		return;
	}
}
