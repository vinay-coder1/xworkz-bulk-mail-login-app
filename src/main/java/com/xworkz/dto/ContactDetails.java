package com.xworkz.dto;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String company;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String phone;
	
	public ContactDetails() {
		super();
	}
}