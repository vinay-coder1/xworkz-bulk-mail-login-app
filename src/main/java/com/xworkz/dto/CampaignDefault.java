package com.xworkz.dto;

import java.io.Serializable;

public class CampaignDefault implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String from_name;
	String from_email;
	String subject;
	String language;
	
	
	public CampaignDefault() {
		super();
	}

	public String getFrom_name() {
		return from_name;
	}

	public void setFrom_name(String from_name) {
		this.from_name = from_name;
	}

	public String getFrom_email() {
		return from_email;
	}

	public void setFrom_email(String from_email) {
		this.from_email = from_email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "CampaignDefault [from_name=" + from_name + ", from_email=" + from_email + ", subject=" + subject
				+ ", language=" + language + "]";
	}

	
	
}