package com.xworkz.service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SMSService {

	Logger logger = LoggerFactory.getLogger(SMSService.class);

	public String sendCampaign(String apiKey, String secretKey, String useType, String phone, String message,
			String senderId) {
		try {
			logger.info("\n\n\nPhone number is {}\n\n", phone);
			// construct data
			JSONObject urlParameters = new JSONObject();
			urlParameters.put("apikey", apiKey);
			urlParameters.put("secret", secretKey);
			urlParameters.put("usetype", useType);
			urlParameters.put("phone", phone);
			urlParameters.put("message", URLEncoder.encode(message, "UTF-8"));
			urlParameters.put("senderid", senderId);
			URL obj = new URL("https://www.sms4india.com/api/v1/sendCampaign");
			// send data
			HttpURLConnection httpConnection = (HttpURLConnection) obj.openConnection();
			httpConnection.setDoOutput(true);
			httpConnection.setRequestMethod("POST");
			DataOutputStream wr = new DataOutputStream(httpConnection.getOutputStream());
			wr.write(urlParameters.toString().getBytes());
			// get the response
			BufferedReader bufferedReader = null;
			if (httpConnection.getResponseCode() == 200) {
				logger.debug("Response code is {}", httpConnection.getResponseCode());
				bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
				logger.debug("Success contact number is {}", httpConnection);
			} else {
				bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getErrorStream()));
				logger.debug("Fail contact number is {}", phone);
			}
			StringBuilder content = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				content.append(line).append("\n");
			}
			bufferedReader.close();
			logger.debug("Content is {}", content);
//		    return content.toString();
			return content.toString();
		} catch (Exception ex) {
//	    	  logger.debug("Content is {}",content.toString());
			logger.error("Exception is {} and message is {}", ex, ex.getMessage());
			return "{'status':500,'message':'Internal Server Error'}";
		}

	}

//	public String sendCampaign(String apiKey,String secretKey,String useType, String phone, String message, String senderId){
//		  StringBuilder content = new StringBuilder();
//		    try {
//		        // construct data
//		        JSONObject urlParameters = new JSONObject();
//		        urlParameters.put("apikey", apiKey);
//		        urlParameters.put("secret", secretKey);
//		        urlParameters.put("usetype", useType);
//		        urlParameters.put("phone", phone);
//		        urlParameters.put("message", URLEncoder.encode(message, "UTF-8"));
//		        urlParameters.put("senderid", senderId);
//		        URL obj = new URL("www.sms4india.com/api/v1/sendCampaign");
//		        // send data
//		        HttpURLConnection httpConnection = (HttpURLConnection) obj.openConnection();
//		        httpConnection.setDoOutput(true);
//		        httpConnection.setRequestMethod("POST");
//		        httpConnection.setRequestProperty("Content-Type", "application/json");
//		        DataOutputStream wr = new DataOutputStream(httpConnection.getOutputStream());
//		        wr.write(urlParameters.toString().getBytes());
//		        // get the response
//		        BufferedReader bufferedReader = null;
//		        if (httpConnection.getResponseCode() == 200) {
//		        	logger.debug("Response code is {}",httpConnection.getResponseCode());
//		            bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
//		            logger.debug("Success contact number is {}",phone);
//		        } else {
//		            bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getErrorStream()));
//		            logger.debug("Fail contact number is {}",phone);
//		        }
//		        String line;
//		        while ((line = bufferedReader.readLine()) != null) {
//		            content.append(line).append("\n");
//		        }
//		        bufferedReader.close();
//		    } catch (Exception ex) {
//		    	logger.error("Exception is {} and message is {}",ex,ex.getMessage());
//		    }
//		    logger.debug("Content is {}",content.toString());
//		    return content.toString();
//	    }

	public String reports(String usetype, String apiKey, String secretKey, String fromDate, String toDate) {
		try {
			// construct data
			// access keys generated at www.way2sms.com
			String api = "apikey=" + URLEncoder.encode(apiKey, "UTF-8");
			String secret = "&secret=" + URLEncoder.encode(secretKey, "UTF-8");
			// use type "stage" or "prod" must be given
			String useType = "&usetype=" + URLEncoder.encode(usetype, "UTF-8");
			String fromdate = "&fromdate=" + URLEncoder.encode(fromDate, "UTF-8");
			String todate = "&todate=" + URLEncoder.encode(toDate, "UTF-8");
			// construct url
			URL obj = new URL(
					"https://www.sms4india.com/api/v1/apireports?" + api + secret + useType + fromdate + todate);

			// send data
			HttpURLConnection httpConnection = (HttpURLConnection) obj.openConnection();
			httpConnection.setRequestMethod("POST");
			httpConnection.setDoOutput(true);
			// get the response
			BufferedReader bufferedReader = null;
			if (httpConnection.getResponseCode() == 200) {
				logger.info("200----->> {}", httpConnection.getContent());
				bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
			} else {
				bufferedReader = new BufferedReader(new InputStreamReader(httpConnection.getErrorStream()));
			}
			StringBuilder content = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				logger.info("line {}", line);
				content.append(line).append("\n");

			}
			bufferedReader.close();
			logger.info("Content is {}", content.toString());
			return content.toString();
		} catch (Exception ex) {
			logger.error("exception is {} and message is {}", ex, ex.getMessage());
			return "{'status':500,'message':'Internal Server Error'}";
		}
	}

}
