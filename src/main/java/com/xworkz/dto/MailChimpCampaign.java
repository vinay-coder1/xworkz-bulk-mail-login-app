package com.xworkz.dto;

import java.io.Serializable; 
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailChimpCampaign implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String id;
	private long webId;
	private String type;
	private String createTime;
	private String archiveURL;
	private String longArchiveURL;
	private String status;
	private long emailSent;
	private String sentTime;
	private String contentType;
	private boolean needsBlockRefresh;
	private boolean resendable;
		
	private MailChimpRecipients recipients;
	private MailChimpSettings settings;
	private MailChimpTracker tracking;
	private MailChimpReport reportSummary;
	private MailChimpDeliveryStatus deliveryStatus;
	private List<Links> links;
	
	public MailChimpCampaign() {
	}
		
}