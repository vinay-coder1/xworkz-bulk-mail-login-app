package com.xworkz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Service
public class SpringMailServiceImpl implements SpringMailService {

	static Logger logger = LoggerFactory.getLogger(SpringMailServiceImpl.class);

	@Autowired
	private JavaMailSender mailSender;
	
	public SpringMailServiceImpl() {
		logger.info("created " + this.getClass().getSimpleName());
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		SpringMailServiceImpl.logger = logger;
	}

	public JavaMailSender getMailSender() {
		return mailSender;
	} 

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	@Override
	public boolean validateAndSendMailByMailId(String to, String subject, String body) {
		logger.info("invoked validateAndSendMailByMailId of SpringMailServiceImpl...");

		SimpleMailMessage mail = new SimpleMailMessage();

		mail.setFrom("xworkzdev@gmail.com");
		mail.setTo(to);
		mail.setSubject(subject);
		mail.setText(body);

		try {
			mailSender.send(mail);
			logger.info("mail sent successfully");
			return true;
		} catch (MailException e) {
			logger.info("mail sent Faild!");
			logger.error(e.getMessage(), e);
		}
		return false;
	}

}
