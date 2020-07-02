package com.xworkz.dto;

import java.io.Serializable;
import java.util.List;

public class MailChimpCampaignList implements Serializable{
	
	private static final long serialVersionUID = 1L;

	List<MailChimpCampaign> campaigns;
	long total_items;
	List<Links> _links;
	public List<MailChimpCampaign> getCampaigns() {
		return campaigns;
	}
	public void setCampaigns(List<MailChimpCampaign> campaigns) {
		this.campaigns = campaigns;
	}
	public long getTotal_items() {
		return total_items;
	}
	public void setTotal_items(long total_items) {
		this.total_items = total_items;
	}
	public List<Links> get_links() {
		return _links;
	}
	public void set_links(List<Links> _links) {
		this._links = _links;
	}
	@Override
	public String toString() {
		return "MailChimpCampaignList [campaigns=" + campaigns + ", total_items=" + total_items + ", _links=" + _links
				+ "]";
	}
	public MailChimpCampaignList() {
	}
	
	
}