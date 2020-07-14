package com.xworkz.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailChimpRecipients implements Serializable {

	private static final long serialVersionUID = 1L;

	private String listId;
	private boolean listIsActive;
	private String listName;
	private String segmentText;
	private String recipientCount;

	public MailChimpRecipients() {
	}

}