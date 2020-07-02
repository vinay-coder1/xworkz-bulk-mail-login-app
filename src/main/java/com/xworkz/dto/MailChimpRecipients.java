package com.xworkz.dto;

import java.io.Serializable;

public class MailChimpRecipients implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String list_id;
	boolean list_is_active;
	String list_name;
	String segment_text;
	String recipient_count;
	
	
	public String getList_id() {
		return list_id;
	}
	public void setList_id(String list_id) {
		this.list_id = list_id;
	}
	public boolean isList_is_active() {
		return list_is_active;
	}
	public void setList_is_active(boolean list_is_active) {
		this.list_is_active = list_is_active;
	}
	public String getList_name() {
		return list_name;
	}
	public void setList_name(String list_name) {
		this.list_name = list_name;
	}
	public String getSegment_text() {
		return segment_text;
	}
	public void setSegment_text(String segment_text) {
		this.segment_text = segment_text;
	}
	public String getRecipient_count() {
		return recipient_count;
	}
	public void setRecipient_count(String recipient_count) {
		this.recipient_count = recipient_count;
	}

	@Override
	public String toString() {
		return "MailChimpRecipients [list_id=" + list_id + ", list_is_active=" + list_is_active + ", list_name="
				+ list_name + ", segment_text=" + segment_text + ", recipient_count=" + recipient_count + "]";
	}
	public MailChimpRecipients() {
	}


}