package com.xworkz.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailChimpSettings implements Serializable {

	private static final long serialVersionUID = 1L;

	private String title;
	private boolean useConversation;
	private String toName;
	private String folderId;
	private boolean authenticate;
	private boolean autoFooter;
	private boolean inlineCss;
	private boolean autoTweet;
	private boolean fbComments;
	private boolean timewarp;
	private long templateId;
	private boolean dragAndDrop;

	public MailChimpSettings() {
	}

}