package com.xworkz.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Stats implements Serializable {

	private static final long serialVersionUID = 1L;

	private String memberCount;
	private String unsubscribeCount;
	private String cleanedCount;
	private String memberCountSinceSend;
	private String unsubscribeCountSinceSend;
	private String cleanedCountSinceSend;
	private String campaignCount;
	private String campaignLastSent;
	private String mergeFieldCount;
	private String avgSubRate;
	private String avgUnsubRate;
	private String targetSubRate;
	private String openRate;
	private String clickRate;
	private String lastSubDate;
	private String lastUnsubDate;

	public Stats() {

	}

}