package com.xworkz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.xworkz.dto.LoginDTO;
import com.xworkz.service.LoginService;

@RestController
@RequestMapping("/")
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Value("${login.username}")
	private String username;

	@Autowired
	private LoginService loginService;

	public LoginController() {
		logger.info("{} Is Created...........", this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/otp.do", method = RequestMethod.POST)
	public ModelAndView generateOTP(@ModelAttribute LoginDTO dto) {
		logger.info("invoked generateOTP()...");
		ModelAndView modelAndView = new ModelAndView("Login");
		try {
			modelAndView.addObject("dto", dto);
			if (dto.getUserName().equals(username)) {
				if (loginService.generateOTP())
					modelAndView.addObject("Successmsg", "One-time password has been sent to your Email id.");
				logger.info("OTP Sent Successfully TO Your Email ID");
				return modelAndView;

			} else {
				modelAndView.addObject("Failmsg",
						"Failed to send OTP, The Username supplied was not valid. Please try again!");
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
			boolean validation = this.loginService.validateAndLogin(dto);
			if (validation) {
				model.addAttribute("loginsuccess", "You have successfully logged in.");
				logger.info("Logined Successfully, UserName and Password Macthed.");
				return new ModelAndView("index");
			}

			else {
				model.addAttribute("loginfaildbypasswod",
						"The OTP entered is invalid or expired. Please generate a new OTP and try again.");
				logger.info(
						"Login Faild! ,The OTP entered is invalid or expired. Please generate a new OTP and try again.");
				return new ModelAndView("Login");
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(), e);
		}

		return null;

	}

}
