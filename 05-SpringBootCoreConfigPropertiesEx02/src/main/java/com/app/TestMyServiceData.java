package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestMyServiceData implements CommandLineRunner 
{
	@Autowired
	private MyServiceData service;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(service);						
	}

}
