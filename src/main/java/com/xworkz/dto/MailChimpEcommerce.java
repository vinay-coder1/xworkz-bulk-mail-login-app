package com.xworkz.dto;

import java.io.Serializable;

public class MailChimpEcommerce implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	long total_orders;
	long total_spent;
	long total_revenue;
	public long getTotal_orders() {
		return total_orders;
	}
	public void setTotal_orders(long total_orders) {
		this.total_orders = total_orders;
	}
	public long getTotal_spent() {
		return total_spent;
	}
	public void setTotal_spent(long total_spent) {
		this.total_spent = total_spent;
	}
	public long getTotal_revenue() {
		return total_revenue;
	}
	public void setTotal_revenue(long total_revenue) {
		this.total_revenue = total_revenue;
	}
	
	@Override
	public String toString() {
		return "MailChimpEcommerce [total_orders=" + total_orders + ", total_spent=" + total_spent + ", total_revenue="
				+ total_revenue + "]";
	}
	
	public MailChimpEcommerce() {

	}
	
	
}