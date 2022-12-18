package com.webModule.webService.data.valuesManger;

import java.util.Observable;
import java.util.Observer;

import com.webModule.webService.data.service.LoggingService;

public class ObjectObserverUtill {
	
	public ObjectObserver observer;
	public ObjectObservable observable;
	
	public ObjectObserverUtill(){
		this.observable = new ObjectObservable();
		this.observer = new ObjectObserver();
		observable.addObserver(observer);
	}
	
	public static LoggingService logSvc = new LoggingService(ObjectObserverUtill.class,""); 
	
	public class ObjectObserver implements Observer {
	    private String strObj = "";
	    private Integer intObj = 0;
	    private Float floatObj = 0f;
	    
	    private NullCheckUtill nulChk = new NullCheckUtill();
	    
	    @Override
	    public void update(Observable o, Object obj) {
	    	if("String".equals(obj.getClass().getSimpleName())) {    		
	    		this.setStrObj((String) obj);
	    	}
	    	if("Integer".equals(obj.getClass().getSimpleName())) {    		
	    		this.setIntObj((Integer) obj);
	    	}
	    	if("Float".equals(obj.getClass().getSimpleName())) {    		
	    		this.setFloatObj((Float) obj);
	    	}
	    }

		public String getStrObj() {
			return strObj;
		}

		public void setStrObj(String strObj) {
			this.strObj = strObj;
			if(!nulChk.NullCheck(strObj)) {	
				if(!"".equals(strObj.trim())) {
					logSvc.setMessage(String.format("String Value Changed : %s", strObj),this);
				}
			} 
		}

		public Integer getIntObj() {
			return intObj;
		}

		public void setIntObj(Integer intObj) {
			this.intObj = intObj;
			logSvc.setMessage(String.format("Integer Value Changed : %s", intObj),this);
		}

		public Float getFloatObj() {
			return floatObj;
		}

		public void setFloatObj(Float floatObj) {
			this.floatObj = floatObj;
			logSvc.setMessage(String.format("Float Value Changed : %s", floatObj),this);
		}

	}
	
	public class ObjectObservable extends Observable {
	    private String strObj;
	    public void setStrObj(String strObj) {
	        this.strObj = strObj;
	        setChanged();
	        notifyObservers(strObj);
	    }
	    private Integer intObj;
	    public void setIntObj(Integer intObj) {
	        this.intObj = intObj;
	        setChanged();
	        notifyObservers(intObj);
	    }
	    private Float floatObj;
	    public void setFloatObj(Float floatObj) {
	        this.floatObj = floatObj;
	        setChanged();
	        notifyObservers(floatObj);
	    }
	}


}
