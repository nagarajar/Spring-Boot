package com.app.nagu;

import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ConfigurationProperties("my.app")
@Component
/*
 * @Getter
 * 
 * @Setter
 * 
 * @ToString
 */
@Data
public class EmailConfig 
{
	private String host;
	private int port;
	private String username;
	private String password;
	
	private Set<String> protocols;
	private Map<String,String> headers;
	
	private Certificate cob;

}
