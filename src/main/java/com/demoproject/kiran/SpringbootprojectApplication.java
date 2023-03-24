package com.demoproject.kiran;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.demoproject.kiran.cVSfVSsDI.DiscountClient;

@SpringBootApplication
public class SpringbootprojectApplication implements CommandLineRunner {
	
	@Autowired
    private ApplicationContext context;
	
	public static void main(String[] args) {
		ApplicationContext appContex = SpringApplication.run(SpringbootprojectApplication.class, args);
		
		/**
		 * construction VS field VS setter Dependency injection
		 */
//		DiscountClient client =	appContex.getBean(DiscountClient.class);
//		client.getDiscount();
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String[] beans = context.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
//            System.out.println(bean);
        }
	}
	

	
}
