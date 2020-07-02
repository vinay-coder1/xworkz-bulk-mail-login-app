package com.xworkz.dto;

import java.io.Serializable;

public class MailChimpDeliveryStatus implements Serializable{
	
	private static final long serialVersionUID = 1L;

	boolean enabled;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public MailChimpDeliveryStatus() {
		super();
	}

	@Override
	public String toString() {
		return "MailChimpDeliveryStatus [enabled=" + enabled + "]";
	}
	
	
}