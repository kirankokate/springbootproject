package com.demoproject.kiran.ConstructorDI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demoproject.kiran.SpringbootprojectApplication;

@SpringBootApplication
public class DIMain {

	public static void main(String[] args) {
		ApplicationContext context = 	SpringApplication.run(SpringbootprojectApplication.class, args);
	Client client =	context.getBean(Client.class);
	client.startService();
	}

}
