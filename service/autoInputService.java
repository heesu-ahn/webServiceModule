package com.webModule.webService.service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AutoInputService {
	public static <T> Object autoInputVoService(Class<T> cls, ArrayList<HashMap<String, Object>> map)
			throws IllegalAccessException, InstantiationException, NoSuchMethodError, InvocationTargetException,
			NoSuchFieldException, SecurityException, IllegalArgumentException, NoSuchMethodException {
		T instance = cls.getConstructor().newInstance();
		
		for(int i = 0; i < map.size(); i++) {
			HashMap<String, Object> element = map.get(i);
			Set<String> ks = element.keySet();
			Iterator<String> ie = ks.iterator();
			while (ie.hasNext()) {
				String key = (String)ie.next();
				Object value = element.get(key);
				String type = value.getClass().getSimpleName();
				Field field = cls.getDeclaredField(key);
				if (field != null) {
					field.setAccessible(true);
					if (type.equals(field.getType().getName().replaceAll(field.getType().getPackageName() + ".",""))) {
						field.set(instance, value);
					}
				}
			}
		}
		return instance;
	}
}
