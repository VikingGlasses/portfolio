package org.benjamin.portfolio.model.bean;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class TrainingSession {

	/**
	 * Compile / summaries the data into a list of doubles.
	 * @return The compiled data.
	 */
	public List<Double> summariesData() {
		// TODO Implement training session summaries data
		// generate data list from variables
		return null;
	}

	/**
	 * Handles new data input.
	 * @param name 
	 */
	public void handle(String name) {
		// TODO Implement training session handle
		
	}
	
}
