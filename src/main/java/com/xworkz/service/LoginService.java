package com.xworkz.service;

import com.xworkz.dto.LoginDTO;


public interface LoginService {

	public boolean generateOTP();
	
	public String genarateRandomOTP();

	public boolean validateAndLogin(LoginDTO dto);

}
