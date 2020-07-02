package com.xworkz.dto;

import java.io.Serializable; 
import java.util.List;

public class MailChimpCampaign implements Serializable {
	
	private static final long serialVersionUID = 1L;

	String id;
	long web_id;
	String type;
	String create_time;
	String archive_url;
	String long_archive_url;
	String status;
	long emails_sent;
	String send_time;
	String content_type;
	boolean needs_block_refresh;
	boolean resendable;
	
	
	MailChimpRecipients recipients;
	MailChimpSettings settings;
	MailChimpTracker tracking;
	MailChimpReport report_summary;
	MailChimpDeliveryStatus delivery_status;
	List<Links> _links;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getWeb_id() {
		return web_id;
	}
	public void setWeb_id(long web_id) {
		this.web_id = web_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getArchive_url() {
		return archive_url;
	}
	public void setArchive_url(String archive_url) {
		this.archive_url = archive_url;
	}
	public String getLong_archive_url() {
		return long_archive_url;
	}
	public void setLong_archive_url(String long_archive_url) {
		this.long_archive_url = long_archive_url;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getEmails_sent() {
		return emails_sent;
	}
	public void setEmails_sent(long emails_sent) {
		this.emails_sent = emails_sent;
	}
	public String getSend_time() {
		return send_time;
	}
	public void setSend_time(String send_time) {
		this.send_time = send_time;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	public boolean isNeeds_block_refresh() {
		return needs_block_refresh;
	}
	public void setNeeds_block_refresh(boolean needs_block_refresh) {
		this.needs_block_refresh = needs_block_refresh;
	}
	public boolean isResendable() {
		return resendable;
	}
	public void setResendable(boolean resendable) {
		this.resendable = resendable;
	}
	public MailChimpRecipients getRecipients() {
		return recipients;
	}
	public void setRecipients(MailChimpRecipients recipients) {
		this.recipients = recipients;
	}
	public MailChimpSettings getSettings() {
		return settings;
	}
	public void setSettings(MailChimpSettings settings) {
		this.settings = settings;
	}
	public MailChimpTracker getTracking() {
		return tracking;
	}
	public void setTracking(MailChimpTracker tracking) {
		this.tracking = tracking;
	}
	public MailChimpDeliveryStatus getDelivery_status() {
		return delivery_status;
	}
	public void setDelivery_status(MailChimpDeliveryStatus delivery_status) {
		this.delivery_status = delivery_status;
	}
	public List<Links> get_links() {
		return _links;
	}
	public void set_links(List<Links> _links) {
		this._links = _links;
	}
	
	public MailChimpReport getReport_summary() {
		return report_summary;
	}
	public void setReport_summary(MailChimpReport report_summary) {
		this.report_summary = report_summary;
	}
	
	@Override
	public String toString() {
		return "MailChimpCampaign [id=" + id + ", web_id=" + web_id + ", type=" + type + ", create_time=" + create_time
				+ ", archive_url=" + archive_url + ", long_archive_url=" + long_archive_url + ", status=" + status
				+ ", emails_sent=" + emails_sent + ", send_time=" + send_time + ", content_type=" + content_type
				+ ", needs_block_refresh=" + needs_block_refresh + ", resendable=" + resendable + "]";
	}
	
	public MailChimpCampaign() {
	}
		
}