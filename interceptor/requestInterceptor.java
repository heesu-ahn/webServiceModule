package com.webModule.webService.interceptor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import org.apache.activemq.artemis.commons.shaded.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webModule.webService.service.dtoService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class requestInterceptor implements HandlerInterceptor {

	private static final Logger log = LoggerFactory.getLogger(requestInterceptor.class);
	private dtoService service;
	private ArrayList<HashMap<String, Object>> data = new ArrayList<>();
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception, IOException {
		
		if(handler instanceof HandlerMethod) {
			HandlerMethod method = (HandlerMethod)handler;
			if("OPTION".equals(request.getMethod())) {
				return true;
			}
			if("GET".equals(request.getMethod())) {
				if(method.getMethod().getName().contains("getInfo")) {					
					getRequestParams(request);
				} 
			} else if("POST".equals(request.getMethod())) {
				
				if(method.getMethod().getName().contains("setInfo")) {					
					getRequestBody(request);
				} else if(method.getMethod().getName().contains("getAuthorization")) {
					getAuthorization(request);
				}	
			}
		}
		
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
	public void getRequestParams(HttpServletRequest request) {
		try {			
			service = new dtoService();
			if(request != null) {			
				Enumeration<String> params = request.getParameterNames();
				while (params.hasMoreElements()) {
					String param = (String) params.nextElement();
					HashMap<String, Object> map = new HashMap<>();
					map.put(param, request.getParameter(param));
					if(map != null) {						
						data = (ArrayList<HashMap<String, Object>>)service.dtoClass(map).get("result");
						request.setAttribute("data", data);
					}
				}
			}
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
	}
	public void getRequestBody(HttpServletRequest request) {
		service = new dtoService();
		StringBuilder builder = new StringBuilder();
		String line = "";
					
		try {			
			InputStream stream = request.getInputStream();
			if(stream != null) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(stream,"UTF-8"));
				while ((line = reader.readLine()) != null) {
					builder.append(line);
				}
				ObjectMapper mapper = new ObjectMapper();
				String jsonString = builder.toString();
				if(!"".equals(jsonString)) {
					HashMap<String, Object> map = mapper.readValue(jsonString, HashMap.class);
					if(map != null) {						
						data = (ArrayList<HashMap<String, Object>>)service.dtoClass(map).get("result");
						request.setAttribute("data", data);
					}						
				}
			}
		} catch (IOException e) {
			log.debug(e.getMessage());
		}
	}
	public void getAuthorization(HttpServletRequest request) {
		Object auth = request.getHeader("Authorization");
		if(auth != null) {
			String authKey = auth.toString().split(" ")[1];
			System.out.println(authKey);
		}
	}

}
