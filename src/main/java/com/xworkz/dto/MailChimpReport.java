package com.xworkz.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailChimpReport implements Serializable {

	private static final long serialVersionUID = 1L;

	private long opens;
	private long uniqueOpens;
	private String openRate;
	private long clicks;
	private long subscriberClicks;
	private long clickRate;
	private MailChimpEcommerce ecommerce;

	public MailChimpReport() {
		super();
	}

}