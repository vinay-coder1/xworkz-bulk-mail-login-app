package com.xworkz.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CampaignDefault implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String fromName;
	private String fromEmail;
	private String subject;
	private String language;
	
	
	public CampaignDefault() {
		super();
	}
	
}