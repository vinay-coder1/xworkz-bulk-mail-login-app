package com.xworkz.dto;

import java.io.Serializable;
import java.util.List;


public class MailChimpList implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	List<MailChimpMailDetails>  lists;	
	int total_items;
	List<Links> _links;
	
	public List<MailChimpMailDetails> getLists() {
		return lists;
	}
	public void setLists(List<MailChimpMailDetails> lists) {
		this.lists = lists;
	}
	public int getTotal_items() {
		return total_items;
	}
	public void setTotal_items(int total_items) {
		this.total_items = total_items;
	}
	public List<Links> get_links() {
		return _links;
	}
	public void set_links(List<Links> _links) {
		this._links = _links;
	}

	
	public MailChimpList() {
	}
	@Override
	public String toString() {
		return "Campaign [total_items=" + total_items + "]";
	}


}