package com.xworkz.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SendMailDTO {

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
	

	public Integer getMsgType() {
		return msgType;
	}

	public void setMsgType(Integer msgType) {
		this.msgType = msgType;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	static Logger logger = LoggerFactory.getLogger(SendMailDTO.class);

	public SendMailDTO() {
		logger.info("{} is Created.........." + this.getClass().getSimpleName());
	}

	public String getSubName() {
		return subName;
	}

	public String getListName() {
		return listName;
	}

	public String getImageURL() {
		return imageURL;
	}

	public String getDynamicNews() {
		return dynamicNews;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public String getDateYear() {
		return dateYear;
	}

	public String getBirthdayQuotes() {
		return birthdayQuotes;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public String getFees() {
		return fees;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public void setDynamicNews(String dynamicNews) {
		this.dynamicNews = dynamicNews;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public void setDateYear(String dateYear) {
		this.dateYear = dateYear;
	}

	public void setBirthdayQuotes(String birthdayQuotes) {
		this.birthdayQuotes = birthdayQuotes;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public void setFees(String fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "SendMailDTO [subName=" + subName + ", listName=" + listName + ", imageURL=" + imageURL
				+ ", dynamicNews=" + dynamicNews + ", courseName=" + courseName + ", batchCode=" + batchCode
				+ ", dateYear=" + dateYear + ", birthdayQuotes=" + birthdayQuotes + ", startDate=" + startDate
				+ ", trainerName=" + trainerName + ", fees=" + fees + ", fileName=" + fileName + ", time=" + time + "]";
	}

}