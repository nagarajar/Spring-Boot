package com.profiles.anno.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
//@Profile({"prod","podsup","uat"})
public class BackDataServiceRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM BACKUP DATA SERVICE");

	}

}
