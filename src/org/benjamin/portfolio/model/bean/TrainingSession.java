package org.benjamin.portfolio.model.bean;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName="session", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class TrainingSession {
	
	// 

	public List<Double> summariesData() {
		// TODO Implement training session summaries data
		// generate data list from variables
		return null;
	}

	public void handle(String name) {
		// TODO Implement training session handle
		
	}

	// Data collection
	
}
