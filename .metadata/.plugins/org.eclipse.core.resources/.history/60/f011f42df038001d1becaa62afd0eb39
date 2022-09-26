package com.app.nagu;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("my.app")
@Component
public class EmailConfig 
{
	private String host;
	private int port;
	private String username;
	private String password;
	
	private Set<String> protocols;
	private Map<String,String> headers;
	
	private Certificate cob;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
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

	public Set<String> getProtocols() {
		return protocols;
	}

	public void setProtocols(Set<String> protocols) {
		this.protocols = protocols;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public Certificate getCob() {
		return cob;
	}

	public void setCob(Certificate cob) {
		this.cob = cob;
	}

	@Override
	public String toString() {
		return "EmailConfig [host=" + host + ", port=" + port + ", username=" + username + ", password=" + password
				+ ", protocols=" + protocols + ", headers=" + headers + ", cob=" + cob + "]";
	}
	
	
	
	
}
