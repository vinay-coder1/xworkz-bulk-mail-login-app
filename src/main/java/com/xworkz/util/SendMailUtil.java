package com.xworkz.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xworkz.service.OkHttpClientService;



public class SendMailUtil {

	static Logger logger = LoggerFactory.getLogger(SendMailUtil.class);

	
	static {
			String path = "./properties/httpConnection.properties";
			System.setProperty("java.util.logging.config.file", path);
		}	
	
	public static void main(String[] args) {
		OkHttpClientService clientService=new OkHttpClientService();
		
		/*		String listId=clientService.getListIdFromListName();
		if(!listId.isEmpty()) {
			logger.info("Id Is {}",listId);
			String campaignId=clientService.createCompaign(listId);
			if(!campaignId.isEmpty()) {
				logger.info("Campaign Is Created.....\nCampaign Id is {}",campaignId);
				boolean edit=clientService.generateContent(campaignId);
				if(edit) {
					logger.info("Content Status is {}",edit);
					logger.info("Send Campaign Is Started..........");
					boolean send=clientService.sendCompaign(campaignId);
					if(send) {
						JOptionPane.showMessageDialog(null, "Mail Sended Successfully");
						logger.info("Mail Successfully Sended.........");
					}else {
						logger.error("Mail Not sended.........");
					}
				}else {
					logger.error("Content Not Genereted.......");
				}
			}else {
				JOptionPane.showMessageDialog(null, "Campaign is Not Created.........");
				logger.error("campaign id is not generated......");
			}
		}else {
			JOptionPane.showMessageDialog(null, "List Is Not Founded........\nPlease Check the List Name");
			logger.error("Did not find the List id from List name");
		}*/
	}
}