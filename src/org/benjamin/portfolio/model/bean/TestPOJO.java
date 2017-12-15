package org.benjamin.portfolio.model.bean;

import java.io.Serializable;

public class TestPOJO implements Serializable {

	private static final long serialVersionUID = 7412336969594635801L;
	
	private String text;

	public TestPOJO(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
