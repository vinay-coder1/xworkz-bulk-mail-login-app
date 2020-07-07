package com.xworkz.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.dto.LoginDTO;
import com.xworkz.service.LoginControllerService;

@RestController
@RequestMapping("/")
public class LoginController {

	static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginControllerService loginService;

	public LoginController() {
		logger.info("{} Is Created...........", this.getClass().getSimpleName());
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		LoginController.logger = logger;
	}

	public LoginControllerService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginControllerService loginService) {
		this.loginService = loginService;
	}

	@RequestMapping(value = "/otp.do", method = RequestMethod.POST)
	public ModelAndView generateOTP(@ModelAttribute LoginDTO dto, Model model) {
		logger.info("invoked generateOTP()...");
		ModelAndView modelAndView = new ModelAndView("Login.jsp");
		try {
			model.addAttribute("dto", dto);
			if (dto.getUserName().equals("X-Workzodc")) {
				if (loginService.generateOTP())
					modelAndView.addObject("Successmsg", "The one-time password has been sent to your Email id.");
				    logger.info("OTP Sent Successfully TO Your Email ID");

			} else {
				modelAndView.addObject("Failmsg", "Failed to send OTP, The Username supplied was not valid. Please try again!");
				logger.info("OTP Sent Failed ,Check The UserId!");

			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		}
		return modelAndView;
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView onLogin(@ModelAttribute LoginDTO dto, Model model) {
		logger.info("invoked onLogin()...");
		try {
			model.addAttribute("dto", dto);
			boolean validation = this.loginService.validateAndLogin(dto, model);
			if (validation) {
				logger.info("DETAILS = " + dto.toString());
				model.addAttribute("loginsuccess", "You have successfully logged in.");
				logger.info("Logined Successfully, UserName and Password Macthed.");
				return new ModelAndView("index.jsp");
			}

			else {
				model.addAttribute("loginfaildbypasswod", "The OTP entered is invalid or expired. Please generate a new OTP and try again.");
				logger.info("Login Faild! ,Passwords Is Incorrect OR Time Out Please Genarate OTP Again!");
				return new ModelAndView("Login.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		}

		return null;

	}

}
