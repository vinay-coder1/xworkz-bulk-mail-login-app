package com.xworkz.dto;

import java.io.Serializable;

public class ContactDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;

	String company;
	String address1;
	String address2;
	String city;
	String state;
	String zip;
	String country;
	String phone;
	
	public ContactDetails() {
		super();
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ContactDetails [company=" + company + ", address1=" + address1 + ", address2=" + address2 + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", country=" + country + ", phone=" + phone + "]";
	}
	
	
	
}