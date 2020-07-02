package com.xworkz.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;


public class MailChimpMailDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;

	String id;
	String web_id;
	String name;

	String permission_reminder;
	String use_archive_bar;

	String notify_on_subscribe;
	String notify_on_unsubscribe;
	String date_created;
	String list_rating;
	String email_type_option;
	String subscribe_url_short;
	String subscribe_url_long;
	String beamer_address;
	String visibility;
	String double_optin;
	String has_welcome;
	String marketing_permissions;
	String[] modules;

	Stats stats;
	CampaignDefault campaign_defaults;
	List<Links> _links;
	ContactDetails contact;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWeb_id() {
		return web_id;
	}

	public void setWeb_id(String web_id) {
		this.web_id = web_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPermission_reminder() {
		return permission_reminder;
	}

	public void setPermission_reminder(String permission_reminder) {
		this.permission_reminder = permission_reminder;
	}

	public String isUse_archive_bar() {
		return use_archive_bar;
	}

	public void setUse_archive_bar(String use_archive_bar) {
		this.use_archive_bar = use_archive_bar;
	}

	public String getNotify_on_subscribe() {
		return notify_on_subscribe;
	}

	public void setNotify_on_subscribe(String notify_on_subscribe) {
		this.notify_on_subscribe = notify_on_subscribe;
	}

	public String getNotify_on_unsubscribe() {
		return notify_on_unsubscribe;
	}

	public void setNotify_on_unsubscribe(String notify_on_unsubscribe) {
		this.notify_on_unsubscribe = notify_on_unsubscribe;
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public String getList_rating() {
		return list_rating;
	}

	public void setList_rating(String list_rating) {
		this.list_rating = list_rating;
	}

	public String isEmail_type_option() {
		return email_type_option;
	}

	public void setEmail_type_option(String email_type_option) {
		this.email_type_option = email_type_option;
	}

	public String getSubscribe_url_short() {
		return subscribe_url_short;
	}

	public void setSubscribe_url_short(String subscribe_url_short) {
		this.subscribe_url_short = subscribe_url_short;
	}

	public String getSubscribe_url_long() {
		return subscribe_url_long;
	}

	public void setSubscribe_url_long(String subscribe_url_long) {
		this.subscribe_url_long = subscribe_url_long;
	}

	public String getBeamer_address() {
		return beamer_address;
	}

	public void setBeamer_address(String beamer_address) {
		this.beamer_address = beamer_address;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String isDouble_optin() {
		return double_optin;
	}

	public void setDouble_optin(String double_optin) {
		this.double_optin = double_optin;
	}

	public String isHas_welcome() {
		return has_welcome;
	}

	public void setHas_welcome(String has_welcome) {
		this.has_welcome = has_welcome;
	}

	public String isMarketing_permissions() {
		return marketing_permissions;
	}

	public void setMarketing_permissions(String marketing_permissions) {
		this.marketing_permissions = marketing_permissions;
	}

	public String[] getModules() {
		return modules;
	}

	public void setModules(String[] modules) {
		this.modules = modules;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}

	public CampaignDefault getCampaign_defaults() {
		return campaign_defaults;
	}

	public void setCampaign_defaults(CampaignDefault campaign_defaults) {
		this.campaign_defaults = campaign_defaults;
	}

	public List<Links> get_links() {
		return _links;
	}

	public void set_links(List<Links> _links) {
		this._links = _links;
	}

	public ContactDetails getContact() {
		return contact;
	}

	public void setContact(ContactDetails contact) {
		this.contact = contact;
	}

	public MailChimpMailDetails() {
	}

	@Override
	public String toString() {
		return "MailChimpMailDetails [id=" + id + ", web_id=" + web_id + ", name=" + name + ", permission_reminder="
				+ permission_reminder + ", use_archive_bar=" + use_archive_bar + ", notify_on_subscribe="
				+ notify_on_subscribe + ", notify_on_unsubscribe=" + notify_on_unsubscribe + ", date_created="
				+ date_created + ", list_rating=" + list_rating + ", email_type_option=" + email_type_option
				+ ", subscribe_url_short=" + subscribe_url_short + ", subscribe_url_long=" + subscribe_url_long
				+ ", beamer_address=" + beamer_address + ", visibility=" + visibility + ", double_optin=" + double_optin
				+ ", has_welcome=" + has_welcome + ", marketing_permissions=" + marketing_permissions + ", modules="
				+ Arrays.toString(modules) + ", stats=" + stats + ", campaign_defaults=" + campaign_defaults
				+ ", _links=" + _links + ", contact=" + contact + "]";
	}

	
}