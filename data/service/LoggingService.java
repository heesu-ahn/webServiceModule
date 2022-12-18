package com.webModule.webService.data.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class LoggingService {
	
	String localDateTime = LocalDateTime.now(ZoneId.of("Asia/Seoul")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
	String FileName = "";
	Class<?> service;
	String serviceType = "";
	public LoggingService(Class<?> service,String serviceType){
		this.service = service;
		this.serviceType = serviceType;
		initFilePath();
	}
	
	public void initFilePath() {
		try {
			String path = this.getClass().getClassLoader().getResource("").getPath();
		    String fullPath = URLDecoder.decode(path, "UTF-8");
		    fullPath = fullPath.substring(1,fullPath.length()-5);
		    FileName =  fullPath + "/logs/"+ localDateTime.substring(0, 10).replaceAll("-", "").toString() +"_application_log.txt";
		} catch (UnsupportedEncodingException e) {
		}
	}
	
	HashMap<String, Object> returnData;
	public String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message, Object obj) {
		this.message = message;
		printDebug();
	}
	
	public void printDebug() {
		if(serviceType == "DEBUG") {			
			FileWrite();
		} else {
			System.out.println(localDateTime +" : " + service.getCanonicalName()  + " >> "  +  message); 
		}
	}

	public void printError() {
		if(serviceType == "DEBUG") {			
			FileWrite();
		} else {
			System.out.println(localDateTime +" : " + service.getCanonicalName()  + " >> "  +  message); 
		}
	}

	private void FileWrite() {
		try
		{
			FileWriter fw = new FileWriter(FileName, true);
			BufferedWriter bw = new BufferedWriter(fw);
		    PrintWriter out = new PrintWriter(bw);
		    out.println(localDateTime +" : " + service.getCanonicalName()  + " >> "  +  message);
		    out.close();
		    bw.close();
		    fw.close();
		} catch (IOException e) {
		    //exception handling left as an exercise for the reader
		}
	}
}
