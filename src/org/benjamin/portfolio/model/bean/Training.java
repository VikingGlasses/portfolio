package org.benjamin.portfolio.model.bean;

import java.util.List;

import org.benjamin.portfolio.spring.repository.HasKey;
import org.springframework.data.annotation.Id;

public class Training implements HasKey {
	
	@Id
	private String key;
	
	private String dateTime; // TODO change type and set time to now;
	private List<Double> data;
	private String result;
	
	public Training() {}
	
	public Training(List<Double> data, String result) {
		this.data = data;
		this.result = result;
	}

	public String getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	public List<Double> getData() {
		return data;
	}
	
	public void setData(List<Double> data) {
		this.data = data;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
