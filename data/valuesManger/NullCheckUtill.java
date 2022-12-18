package com.webModule.webService.data.valuesManger;

import java.util.ArrayList;
import java.util.HashMap;

public class NullCheckUtill {
	public tempObject tmp = null;
	public NullCheckUtill(){
		tmp = new tempObject();
	}
	private class tempObject {
		
		private Class cls = null;
		private ArrayList<HashMap<String, Object>> arrLst = null;
		private HashMap<String, Object> hsMap = null;
		private String str = null;
		public Boolean nullObj = false;
		
		public Class getCls() {
			return cls;
		}
		public void setCls(Class<?> cls) {
			this.cls = cls;
		}
		public ArrayList<HashMap<String, Object>> getArrLst() {
			return arrLst;
		}
		public void setArrLst(ArrayList<HashMap<String, Object>> arrLst) {
			this.arrLst = arrLst;
		}
		public HashMap<String, Object> getHsMap() {
			return hsMap;
		}
		public void setHsMap(HashMap<String, Object> hsMap) {
			this.hsMap = hsMap;
		}
		public String getStr() {
			return str;
		}
		public void setStr(String str) {
			this.str = str;
		}
		public Boolean getNullObj() {
			return nullObj;
		}
		public void setNullObj(Boolean nullObj) {
			this.nullObj = nullObj;
		}
	}

	public Boolean NullCheck(Class<?> service) {
		tmp.setCls(service);
		if(tmp.getCls() == null) 
		{
			tmp.setNullObj(true);
		}
		return tmp.getNullObj();
	}
	public Boolean NullCheck(ArrayList<HashMap<String, Object>> arrLst) {
		tmp.setArrLst(arrLst);
		if(tmp.getArrLst() == null) 
		{
			tmp.setNullObj(true);
		}
		return tmp.getNullObj();
	}
	public Boolean NullCheck(HashMap<String, Object> hsMap) {
		tmp.setHsMap(hsMap);
		if(tmp.getHsMap() == null) 
		{
			tmp.setNullObj(true);
		}
		return tmp.getNullObj();
	}
	public Boolean NullCheck(String str) {
		tmp.setStr(str);
		if(tmp.getStr() == null) 
		{
			tmp.setNullObj(true);
		}
		return tmp.getNullObj();
	}
	

}
