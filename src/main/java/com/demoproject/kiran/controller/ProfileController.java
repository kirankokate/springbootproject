package com.demoproject.kiran.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoproject.kiran.profile.MyConfig;

@RestController
public class ProfileController {
	
	@Autowired
    private MyConfig myConfig;
	
	@Value("${spring.jpa.database-platform}")
	private String message;

	@RequestMapping(value = "/getConfig")
	public Map<String, Object> dynamicConfiguration() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", myConfig.getName());
		map.put("number", myConfig.getNumber());
		map.put("value", myConfig.isValue());
		map.put("aaa", message);
		return map;
	}
}
