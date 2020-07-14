package com.xworkz.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailChimpEcommerce implements Serializable {

	private static final long serialVersionUID = 1L;

	private long totalOrders;
	private long totalSpent;
	private long totalRevenue;

	public MailChimpEcommerce() {

	}

}