package com.demoproject.kiran.ConstructorDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Client {

	
	DependencyService dependencyService;
	
	@Autowired
	public Client(DependencyService dependencyService) {
		this.dependencyService = dependencyService;
	}
	
	public void startService() {
		System.out.println(this.dependencyService.getService() +" start ");
	}
	
	public void stopService() {
		System.out.println(this.dependencyService.getService() +" stop ");
	}

}
