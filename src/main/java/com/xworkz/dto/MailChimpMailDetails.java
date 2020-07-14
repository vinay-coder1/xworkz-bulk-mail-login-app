package com.xworkz.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailChimpMailDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String webId;
	private String name;

	private String permissionReminder;
	private String useArchiveBar;

	private String notifyOnSubscribe;
	private String notifyOnUnsubscribe;
	private String dateCreated;
	private String listRating;
	private String emailTypeOption;
	private String subscribeUrlShort;
	private String subscribeUrlLong;
	private String beamerAddress;
	private String visibility;
	private String doubleOptin;
	private String hasWelcome;
	private String marketingPermissions;
	private String[] modules;

	private Stats stats;
	private CampaignDefault campaignDefaults;
	private List<Links> links;
	private ContactDetails contact;

	public MailChimpMailDetails() {
	}

}