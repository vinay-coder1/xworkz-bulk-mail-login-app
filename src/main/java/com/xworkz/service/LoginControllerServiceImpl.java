package com.xworkz.service;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.dao.LoginControllerDAO;
import com.xworkz.dto.LoginDTO;

@Service
public class LoginControllerServiceImpl implements LoginControllerService {

	static Logger logger = LoggerFactory.getLogger(LoginControllerServiceImpl.class);

	public String temporaryPass;

	public LocalTime mailsentTime;

	public LocalTime loginTime;

	@Autowired
	private LoginControllerDAO loginDAO;

	@Autowired
	private SpringMailService mailService;

	public LoginControllerServiceImpl() {
		logger.info("{} Is Created...........", this.getClass().getSimpleName());
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		LoginControllerServiceImpl.logger = logger;
	}

	public LoginControllerDAO getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginControllerDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	public SpringMailService getMailService() {
		return mailService;
	}

	public void setMailService(SpringMailService mailService) {
		this.mailService = mailService;
	}

	@Override
	public boolean validateAndLogin(LoginDTO dto, Model model) {
		logger.info("invoked validateAndLogin...");

		String givenPassword = dto.getPassword();
		logger.info("givenPassword=" + givenPassword);

		logger.info("temporaryPass=" + temporaryPass);

		loginTime = LocalTime.now();

		logger.info("Logintime=" + loginTime);

		Duration timeElapsed = Duration.between(mailsentTime, loginTime);

		long diffrencetime = timeElapsed.toMinutes();

		logger.info("Time taken: " + diffrencetime + " minutes");

		if (diffrencetime<=10 && temporaryPass != null && givenPassword.equals(temporaryPass)) {
			logger.info("givenPassword is correct");
			return true;
		} else {
			logger.info("givenPassword is Incorrect OR Time Out");
			return false;
		}

	}

	@Override
	public boolean generateOTP() {
		logger.info("invoked generateOTP in service...");

		try {
			String onetimepass = loginDAO.genarateOTP();
			temporaryPass = onetimepass;
			if (Objects.nonNull(onetimepass)) {
				logger.info("onetimepass generated in service...");
				String mailID = "contact@x-workz.in";
				String subject = "Xworkz Bulk Mail App OTP";
				String body = "Hi  X-workzodc" + "\n Your Xworkz Bulk Mail App, One Time Password is = " + onetimepass
						+ "\n Its' valid for 10 Minutes.";
				boolean mailvalidation = mailService.validateAndSendMailByMailId(mailID, subject, body);

				if (mailvalidation) {
					logger.info("success", "Your Password sent to your mailID");
					mailsentTime = LocalTime.now();
					logger.info("MailsentTime=" + mailsentTime);
					return true;
				} else {
					logger.info("faild", "Password can't able send to your mailID!");
					return false;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		}
		return false;

	}
}
