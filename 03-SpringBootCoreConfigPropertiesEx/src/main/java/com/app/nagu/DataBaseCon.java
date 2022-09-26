package com.app.nagu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")
public class DataBaseCon 
{
	private String driver;
	private String url;
	private String username;
	private String password;
	
	//Note: @ConfigurationProperties - is used to load lot of key-values from application.properties file at onetime
	//Condition: It should need Getters and Setters
	

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "DataBaseCon [driver=" + driver + ", url=" + url + ", user=" + username + ", password=" + password + "]";
	}
	
}
