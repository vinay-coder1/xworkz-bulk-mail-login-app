package com.xworkz.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.util.EncryptionHelper;
import com.xworkz.util.ExcelHelper;

@Service
public class XworkzService {

	static Logger logger = LoggerFactory.getLogger(XworkzService.class);
	@Autowired
	ExcelHelper excelHelper;
	@Autowired
	SMSService smsService;
	@Autowired
	EncryptionHelper encryptionHelper;
	@Value("${apiKey}")
	private String apiKey;
	@Value("${secretKey}")
	private String secretKey;
	@Value("${senderId}")
	private String senderId;
	@Value("${useType}")
	private String useType;

	public List<String> getContactListFromXls(MultipartFile file) {
		if (!file.isEmpty()) {
			List<String> contactList = null;
			try {
				byte[] bytes = file.getBytes();
				String filename = file.getOriginalFilename();
				// Creating the directory to store file
				logger.info("File name is {}", filename);

				if ((file.getInputStream() != null)) {
					contactList = excelHelper.getContactListFromInputStream(file.getInputStream());
				}
				return contactList;
			} catch (Exception e) {
				logger.info(e.getMessage());
			}
		}
		return null;
	}

	public void sendMSG(List<String> contactList, String message) {
		for (String phone : contactList) {
			if (phone.length() == 10) {
				try {
					Thread.sleep(6000);
					logger.debug("API KEY is {} Secret Key is {} Sender id is {} useType is {}",
							encryptionHelper.decrypt(apiKey), encryptionHelper.decrypt(secretKey), senderId, useType);
					String res = smsService.sendCampaign(encryptionHelper.decrypt(apiKey),
							encryptionHelper.decrypt(secretKey), useType, phone, message, senderId);
					logger.info("Result is {}",res);
				} catch (InterruptedException e) {
					logger.error("\n\nMessage is {} and exception is {}\n\n\n\n\n",e.getMessage(),e);
				}
				
			}
		}
	}

	public String getReport(String startDate, String endDate) {
		return smsService.reports("prod",apiKey,secretKey,"2019-12-01","2020-01-30");
		
	}

}
