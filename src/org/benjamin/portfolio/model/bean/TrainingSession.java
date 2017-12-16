package org.benjamin.portfolio.model.bean;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * Session bean for handling new user input and compiling it into usable numeric data,
 * for storage and machine learning purposes.
 * 
 * @author Benjamin Rosman
 *
 */
@Component
@Scope(scopeName="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class TrainingSession {

	/**
	 * Compile / summaries the containing data into a list of doubles that is usable for 
	 * saving and machine learning calculations.
	 * @return The compiled numeric data as a list.
	 */
	public List<Double> summariesData() {
		// TODO Implement training session summaries data
		// generate data list from content
		return null;
	}

	/**
	 * Handles new data input that can be compiled to usable numeric data.
	 * @param input New input data.
	 */
	public void handle(String input) {
		// TODO Implement training session handle
		// update content.
	}
	
}
