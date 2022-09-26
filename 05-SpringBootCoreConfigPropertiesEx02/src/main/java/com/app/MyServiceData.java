package com.app;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")
public class MyServiceData 
{
	//Primitive
	private int id;
	private String code;
	private boolean active;
	
	//Collection
	private List<String> data; //ArrayList
	//private Set<String> data; //LinkedHashSet
	//private String[] data; 
	
	private Map<String,String> info; //LinkedHashMap
	
	//Reference
	private Process pob;
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	public Map<String, String> getInfo() {
		return info;
	}
	public void setInfo(Map<String, String> info) {
		this.info = info;
	}
	public Process getPob() {
		return pob;
	}
	public void setPob(Process pob) {
		this.pob = pob;
	}
	@Override
	public String toString() {
		return "MyServiceData [id=" + id + ", code=" + code + ", active=" + active + ", data=" + data + ", info=" + info
				+ ", pob=" + pob + "]";
	}
	
	
	
	
	
	
}
