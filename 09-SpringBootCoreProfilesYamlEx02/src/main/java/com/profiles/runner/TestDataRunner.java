package com.profiles.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.profiles.dbcon.MyDbConnection;

@Component
public class TestDataRunner implements CommandLineRunner
{
	@Autowired
	private MyDbConnection con;
	
	public void run(String... args) throws Exception {
		System.out.println(con);
	}
}
