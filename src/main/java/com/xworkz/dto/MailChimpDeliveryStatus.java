package com.xworkz.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailChimpDeliveryStatus implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean enabled;

	public MailChimpDeliveryStatus() {
		super();
	}

}