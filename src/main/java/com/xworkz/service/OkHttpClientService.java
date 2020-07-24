package com.xworkz.service;

import com.google.gson.JsonObject;
import com.xworkz.dto.SendMailDTO;

public interface OkHttpClientService {

	public boolean sendCompaign(String compaignId, Integer integer);

	public boolean generateContent(String campaignId, SendMailDTO dto);

	public String createCompaign(String listId, SendMailDTO dto);

	public JsonObject createJsonObject(String listId, SendMailDTO dto);

	public String getCompaignDetails();

	public String getAllMailChimpList(Integer mailid);

	public String getListIdFromListName(String listName, Integer mailid);

	public String getHTMLTextFromFile(SendMailDTO dto);

	public String replaceHTMLData(SendMailDTO dto, String data);
}
