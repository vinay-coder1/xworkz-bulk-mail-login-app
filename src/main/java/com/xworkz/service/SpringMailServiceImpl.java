package com.xworkz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessagePreparator;

@Service
public class SpringMailServiceImpl implements SpringMailService {

	private Logger logger = LoggerFactory.getLogger(SpringMailServiceImpl.class);

	@Autowired
	private JavaMailSender mailSender;

	public SpringMailServiceImpl() {
		logger.info("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSendMailByMailId(MimeMessagePreparator messagePreparator) {
		logger.info("invoked validateAndSendMailByMailId of SpringMailServiceImpl...");

		try {
			mailSender.send(messagePreparator);
			logger.info("Mail sent successfully");
			return true;
		} catch (MailException e) {
			logger.info("Mail sent Faild!");
			logger.error(e.getMessage(), e);
		}
		return false;
	}

}
