package com.demoproject.kiran.profile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value="dev")
public class DevRunner implements CommandLineRunner {
	@Override
    public void run(String... args) throws Exception {

        System.out.println("In dev");
    }
}
	


