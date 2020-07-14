package com.xworkz.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SendMailDTO {

	private Logger logger = LoggerFactory.getLogger(LoginDTO.class);

	private Integer msgType;
	private String subName;
	private String listName;
	private String imageURL;
	private String dynamicNews;
	private String courseName;
	private String batchCode;
	private String dateYear;
	private String birthdayQuotes;
	private String startDate;
	private String trainerName;
	private String fees;
	private String fileName;
	private String time;

	public SendMailDTO() {
		logger.info("{} Is Created...........", this.getClass().getSimpleName());
	}

}