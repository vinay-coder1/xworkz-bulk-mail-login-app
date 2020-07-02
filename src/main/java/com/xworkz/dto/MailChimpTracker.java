package com.xworkz.dto;

import java.io.Serializable;

public class MailChimpTracker implements Serializable{

	private static final long serialVersionUID = 1L;
	
	boolean opens;
	boolean html_clicks;
	boolean	text_clicks;
	boolean goal_tracking;
	boolean ecomm360;
	String google_analytics;
	String clicktale;

	
	public boolean isOpens() {
		return opens;
	}
	public void setOpens(boolean opens) {
		this.opens = opens;
	}
	public boolean isHtml_clicks() {
		return html_clicks;
	}
	public void setHtml_clicks(boolean html_clicks) {
		this.html_clicks = html_clicks;
	}
	public boolean isText_clicks() {
		return text_clicks;
	}
	public void setText_clicks(boolean text_clicks) {
		this.text_clicks = text_clicks;
	}
	public boolean isGoal_tracking() {
		return goal_tracking;
	}
	public void setGoal_tracking(boolean goal_tracking) {
		this.goal_tracking = goal_tracking;
	}
	public boolean isEcomm360() {
		return ecomm360;
	}
	public void setEcomm360(boolean ecomm360) {
		this.ecomm360 = ecomm360;
	}
	public String getGoogle_analytics() {
		return google_analytics;
	}
	public void setGoogle_analytics(String google_analytics) {
		this.google_analytics = google_analytics;
	}
	public String getClicktale() {
		return clicktale;
	}
	public void setClicktale(String clicktale) {
		this.clicktale = clicktale;
	}
	
	@Override
	public String toString() {
		return "MailChimpTracker [opens=" + opens + ", html_clicks=" + html_clicks + ", text_clicks=" + text_clicks
				+ ", goal_tracking=" + goal_tracking + ", ecomm360=" + ecomm360 + ", google_analytics="
				+ google_analytics + ", clicktale=" + clicktale + "]";
	}
	
	public MailChimpTracker() {

	}

}