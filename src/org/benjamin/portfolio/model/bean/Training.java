package org.benjamin.portfolio.model.bean;

import java.util.List;

import org.benjamin.portfolio.model.repository.TrainingRepository;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Bean for persistent storage of a training example for a machine learning algorithm.
 * 
 * @author Benjamin Rosman
 * @see TrainingRepository
 *
 */
@Document(collection="training_examples")
public class Training {
	
	@Id
	private String key;
	
	private String dateTime; // TODO change type and set default time to now;
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

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
