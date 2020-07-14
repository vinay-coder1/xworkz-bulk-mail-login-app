package com.xworkz.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailChimpTracker implements Serializable {

	private static final long serialVersionUID = 1L;

	private boolean opens;
	private boolean htmlClicks;
	private boolean textClicks;
	private boolean goalTracking;
	private boolean ecomm360;
	private String googleAnalytics;
	private String clicktale;

	public MailChimpTracker() {

	}

}