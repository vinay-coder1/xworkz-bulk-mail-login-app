package com.xworkz.service;

public interface SMSService {
  
	public String sendCampaign(String apiKey, String secretKey, String useType, String phone, String message,
			String senderId);
	
	public String reports(String usetype, String apiKey, String secretKey, String fromDate, String toDate);
}
