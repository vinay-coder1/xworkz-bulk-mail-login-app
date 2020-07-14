package com.xworkz.service;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;
import com.xworkz.dto.LoginDTO;

@Service
public class LoginServiceImpl implements LoginService {

	private Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Autowired
	private SpringMailService mailService;

	@Autowired
	private SpringTemplateEngine templateEngine;

	@Value("${to.MailID}")
	private String toMailId;
	@Value("${to.MailSubject}")
	private String toMailSubject;
	@Value("${mailFrom}")
	private String mailFrom;

	private LocalTime mailsentTime;
	private LocalTime loginTime;
	private String temporaryPass;

	public LoginServiceImpl() {
		logger.info("{} Is Created...........", this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndLogin(LoginDTO dto) {
		logger.info("invoked validateAndLogin...");

		String givenPassword = dto.getPassword();
		loginTime = LocalTime.now();
		logger.info("Logintime : {}", loginTime);
		Duration timeElapsed = Duration.between(mailsentTime, loginTime);
		long diffrencetime = timeElapsed.toMinutes();
		logger.info("Time taken : {}", diffrencetime + " minutes");

		if (diffrencetime <= 10 && temporaryPass != null && givenPassword.equals(temporaryPass)) {
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
			String onetimepass = genarateRandomOTP();
			temporaryPass = onetimepass;
			if (Objects.nonNull(onetimepass)) {
				logger.info("onetimepass generated in service...");
				Context context = new Context();
				context.setVariable("onetimepass", onetimepass);

				String content = templateEngine.process("otpMailTemplate", context);
				MimeMessagePreparator messagePreparator = mimeMessage -> {

					MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
					messageHelper.setFrom(mailFrom);
					messageHelper.setTo(toMailId);
					messageHelper.setSubject(toMailSubject);
					messageHelper.setText(content, true);
				};

				boolean mailvalidation = mailService.validateAndSendMailByMailId(messagePreparator);

				if (mailvalidation) {
					logger.info("success", "Your Password sent to your mailID");
					mailsentTime = LocalTime.now();
					logger.info("MailsentTime: {}", mailsentTime);
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

	@Override
	public String genarateRandomOTP() {
		String newRandomPassword = RandomStringUtils.randomNumeric(6);
		return newRandomPassword;
	}

}
