package org.benjamin.portfolio.model.bean;

import org.benjamin.portfolio.model.repository.TokenRepository;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Token associated with a users current behavior and administrator permission.
 * 
 * <p>Used for persistent storage of tokens and keeping track of a users current
 * permission and request behavior.</p>
 * 
 * @author Benjamin Rosman
 * @see TokenRepository
 */
@Document(collection = "tokens")
public class Token {
	
	@Id
	private String key;
	private String expire;
	private RequestSlip requestSlip;
	
	public Token() {
	}
	
	public Token(String expire, RequestSlip requestSlip) {
		this.expire = expire;
		this.requestSlip = requestSlip;
	}

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
