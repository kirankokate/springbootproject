package com.demoproject.kiran.ConstructorDI;

import org.springframework.stereotype.Service;

@Service
public class DependencyService {
	
	public String getService( ) {
		return "DependencyService";
	}
}
