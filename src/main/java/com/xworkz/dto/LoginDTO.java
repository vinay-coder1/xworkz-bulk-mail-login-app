package com.xworkz.dto;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	static Logger logger = LoggerFactory.getLogger(LoginDTO.class);

	private String userName;

	private String password;

	public LoginDTO() {
		logger.info("{} Is Created...........", this.getClass().getSimpleName());
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		LoginDTO.logger = logger;
	}

	@Override
	public String toString() {
		return "LoginDTO [userName=" + userName + ", password=" + password + "]";
	}

}
