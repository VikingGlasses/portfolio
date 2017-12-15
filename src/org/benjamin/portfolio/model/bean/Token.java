package org.benjamin.portfolio.model.bean;

import org.benjamin.portfolio.spring.repository.HasKey;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tokens")
public class Token implements HasKey {
	
	@Id
	private String key;
	private String expire;
	private RequestSlip requestSlip;
	
	public Token() {
		requestSlip = new RequestSlip();
	}
	
	@Override
	public String getKey() {
		return key;
	}
	
	public String getExpire() {
		return expire;
	}
	
	public void setExpire(String expire) {
		this.expire = expire;
	}
	
	public RequestSlip getRequestSlip() {
		return requestSlip;
	}
	
	public void setRequestSlip(RequestSlip requestSlip) {
		this.requestSlip = requestSlip;
	}

}
