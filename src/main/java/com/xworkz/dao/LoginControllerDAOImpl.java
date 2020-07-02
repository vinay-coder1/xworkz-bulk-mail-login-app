package com.xworkz.dao;

import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LoginControllerDAOImpl implements LoginControllerDAO {
	
	static Logger logger = LoggerFactory.getLogger(LoginControllerDAOImpl.class);

	public LoginControllerDAOImpl() {
		logger.info("{} Is Created...........",this.getClass().getSimpleName());	}
	
	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		LoginControllerDAOImpl.logger = logger;
	}

	@Override
	public String genarateOTP() {
		String newRandomPassword = RandomStringUtils.randomNumeric(6);
		return newRandomPassword;
	}

}
