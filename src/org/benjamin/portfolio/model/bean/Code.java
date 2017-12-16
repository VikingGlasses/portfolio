package org.benjamin.portfolio.model.bean;

import org.benjamin.portfolio.model.repository.CodeRepository;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Code associated with behavior and administrator permission.
 * 
 * <p>Used for persistent code storing and changing the behavior associated with
 * a users token.</p>
 * 
 * @author Benjamin Rosman
 * @see CodeRepository
 *
 */
@Document(collection = "codes")
public class Code {
	
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
