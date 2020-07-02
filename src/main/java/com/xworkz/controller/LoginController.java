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
		ModelAndView modelAndView = new ModelAndView("Login");
		try {
			model.addAttribute("dto", dto);
			if (dto.getUserName().equals("X-Workzodc")) {
				if (loginService.generateOTP())
					modelAndView.addObject("Successmsg", "OTP Sent Successfully To contact@x-workz.in");
				    logger.info("OTP Sent Successfully TO contact@x-workz.in");

			} else {
				modelAndView.addObject("Failmsg", "OTP Sent Failed ,Check The UserName!");
				logger.info("OTP Sent failed ,check the UserId!");

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
				model.addAttribute("loginsuccess", "Logined Successfully, UserName and Password Macthed.");
				logger.info("Logined Successfully, UserName and Password Macthed.");
				return new ModelAndView("index");
			}

			else {
				model.addAttribute("loginfaildbypasswod", "Login Faild! , UserName and Passwords Is Incorrect. ");
				logger.info("Logined Successfully, UserName and Passwords Is Incorrect.");
				return new ModelAndView("Login");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		}

		return null;

	}

}
