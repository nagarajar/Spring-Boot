package com.profiles.anno.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
//@Profile({"qa","default","uat"})
public class DbUserSetupRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM DbUser SETUP RUNNER");

	}

}
