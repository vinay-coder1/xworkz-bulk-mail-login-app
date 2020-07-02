package com.xworkz.dto;

import java.io.Serializable;

public class Stats implements Serializable{

	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	String member_count;
	String unsubscribe_count;
	String cleaned_count;
	String member_count_since_send;
	String unsubscribe_count_since_send;
	String cleaned_count_since_send;
	String campaign_count;
	String campaign_last_sent;
	String merge_field_count;
	String avg_sub_rate;
	String avg_unsub_rate;
	String target_sub_rate;
	String open_rate;
	String click_rate;
	String last_sub_date;
	String last_unsub_date;
	
	
	
	public String getMember_count() {
		return member_count;
	}
	public void setMember_count(String member_count) {
		this.member_count = member_count;
	}
	public String getUnsubscribe_count() {
		return unsubscribe_count;
	}
	public void setUnsubscribe_count(String unsubscribe_count) {
		this.unsubscribe_count = unsubscribe_count;
	}
	public String getCleaned_count() {
		return cleaned_count;
	}
	public void setCleaned_count(String cleaned_count) {
		this.cleaned_count = cleaned_count;
	}
	public String getMember_count_since_send() {
		return member_count_since_send;
	}
	public void setMember_count_since_send(String member_count_since_send) {
		this.member_count_since_send = member_count_since_send;
	}
	public String getUnsubscribe_count_since_send() {
		return unsubscribe_count_since_send;
	}
	public void setUnsubscribe_count_since_send(String unsubscribe_count_since_send) {
		this.unsubscribe_count_since_send = unsubscribe_count_since_send;
	}
	public String getCleaned_count_since_send() {
		return cleaned_count_since_send;
	}
	public void setCleaned_count_since_send(String cleaned_count_since_send) {
		this.cleaned_count_since_send = cleaned_count_since_send;
	}
	public String getCampaign_count() {
		return campaign_count;
	}
	public void setCampaign_count(String campaign_count) {
		this.campaign_count = campaign_count;
	}
	public String getCampaign_last_sent() {
		return campaign_last_sent;
	}
	public void setCampaign_last_sent(String campaign_last_sent) {
		this.campaign_last_sent = campaign_last_sent;
	}
	public String getMerge_field_count() {
		return merge_field_count;
	}
	public void setMerge_field_count(String merge_field_count) {
		this.merge_field_count = merge_field_count;
	}
	public String getAvg_sub_rate() {
		return avg_sub_rate;
	}
	public void setAvg_sub_rate(String avg_sub_rate) {
		this.avg_sub_rate = avg_sub_rate;
	}
	public String getAvg_unsub_rate() {
		return avg_unsub_rate;
	}
	public void setAvg_unsub_rate(String avg_unsub_rate) {
		this.avg_unsub_rate = avg_unsub_rate;
	}
	public String getTarget_sub_rate() {
		return target_sub_rate;
	}
	public void setTarget_sub_rate(String target_sub_rate) {
		this.target_sub_rate = target_sub_rate;
	}
	public String getOpen_rate() {
		return open_rate;
	}
	public void setOpen_rate(String open_rate) {
		this.open_rate = open_rate;
	}
	public String getClick_rate() {
		return click_rate;
	}
	public void setClick_rate(String click_rate) {
		this.click_rate = click_rate;
	}
	public String getLast_sub_date() {
		return last_sub_date;
	}
	public void setLast_sub_date(String last_sub_date) {
		this.last_sub_date = last_sub_date;
	}
	public String getLast_unsub_date() {
		return last_unsub_date;
	}
	public void setLast_unsub_date(String last_unsub_date) {
		this.last_unsub_date = last_unsub_date;
	}
	@Override
	public String toString() {
		return "Stats [member_count=" + member_count + ", unsubscribe_count=" + unsubscribe_count + ", cleaned_count="
				+ cleaned_count + ", member_count_since_send=" + member_count_since_send
				+ ", unsubscribe_count_since_send=" + unsubscribe_count_since_send + ", cleaned_count_since_send="
				+ cleaned_count_since_send + ", campaign_count=" + campaign_count + ", campaign_last_sent="
				+ campaign_last_sent + ", merge_field_count=" + merge_field_count + ", avg_sub_rate=" + avg_sub_rate
				+ ", avg_unsub_rate=" + avg_unsub_rate + ", target_sub_rate=" + target_sub_rate + ", open_rate="
				+ open_rate + ", click_rate=" + click_rate + ", last_sub_date=" + last_sub_date + ", last_unsub_date="
				+ last_unsub_date + "]";
	}
	public Stats() {

	}
	
	
		
}