package com.xworkz.dto;


import java.io.Serializable;

public class MailChimpReport implements Serializable{

	private static final long serialVersionUID = 1L;
	
	long opens;
	long unique_opens;
	String open_rate;
	long clicks;
	long subscriber_clicks;
	long click_rate;
	
	MailChimpEcommerce ecommerce;

	public long getOpens() {
		return opens;
	}

	public void setOpens(long opens) {
		this.opens = opens;
	}

	public long getUnique_opens() {
		return unique_opens;
	}

	public void setUnique_opens(long unique_opens) {
		this.unique_opens = unique_opens;
	}

	public String getOpen_rate() {
		return open_rate;
	}

	public void setOpen_rate(String open_rate) {
		this.open_rate = open_rate;
	}

	public long getClicks() {
		return clicks;
	}

	public void setClicks(long clicks) {
		this.clicks = clicks;
	}

	public long getSubscriber_clicks() {
		return subscriber_clicks;
	}

	public void setSubscriber_clicks(long subscriber_clicks) {
		this.subscriber_clicks = subscriber_clicks;
	}

	public long getClick_rate() {
		return click_rate;
	}

	public void setClick_rate(long click_rate) {
		this.click_rate = click_rate;
	}

	public MailChimpEcommerce getEcommerce() {
		return ecommerce;
	}

	public void setEcommerce(MailChimpEcommerce ecommerce) {
		this.ecommerce = ecommerce;
	}

	public MailChimpReport() {
		super();
	}

	@Override
	public String toString() {
		return "MailChimpReport [opens=" + opens + ", unique_opens=" + unique_opens + ", open_rate=" + open_rate
				+ ", clicks=" + clicks + ", subscriber_clicks=" + subscriber_clicks + ", click_rate=" + click_rate
				+ ", ecommerce=" + ecommerce + "]";
	}
	
	
}