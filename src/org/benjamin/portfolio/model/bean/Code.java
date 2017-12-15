package org.benjamin.portfolio.model.bean;

import java.io.Serializable;

import org.benjamin.portfolio.spring.repository.HasKey;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "codes")
public class Code implements HasKey, Serializable {
	
	private static final long serialVersionUID = 6222099660440989434L;
	
	@Id
	private String key;
	private String code;
	private RequestSlip requestSlip;
	private boolean admin;

	public Code() {
	}
	
	public Code(String code, RequestSlip requestSlip, boolean admin) {
		this.code = code;
		this.requestSlip = requestSlip;
		this.admin = admin;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public RequestSlip getRequestSlip() {
		return requestSlip;
	}

	public void setRequestSlip(RequestSlip requestSlip) {
		this.requestSlip = requestSlip;
	}

	@Override
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return String.format("Code [key=%s, code=%s, requestSlip=%s, admin=%s]", key, code, requestSlip, admin);
	}

}
