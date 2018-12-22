package com.redhat.ssi.currency;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "currency")
public class Currency {
	
	@Id
    private String id;
    public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	private String currencyName;
    private String currencyCode;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

	
}