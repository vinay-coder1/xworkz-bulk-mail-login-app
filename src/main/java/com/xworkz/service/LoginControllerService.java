package com.xworkz.service;

import org.springframework.ui.Model;

import com.xworkz.dto.LoginDTO;


public interface LoginControllerService {

	public boolean validateAndLogin(LoginDTO dto, Model model);

	public boolean generateOTP();

}
