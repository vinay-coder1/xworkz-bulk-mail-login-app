package com.xworkz.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface XworkzService {

	public List<String> getContactListFromXls(MultipartFile file);

	public void sendMSG(List<String> contactList, String message);

	public String getReport(String startDate, String endDate);
}
