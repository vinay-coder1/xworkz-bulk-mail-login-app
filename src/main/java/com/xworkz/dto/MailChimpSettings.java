package com.xworkz.dto;

import java.io.Serializable;

public class MailChimpSettings implements Serializable {

	private static final long serialVersionUID = 1L;
	
	String title;
	boolean use_conversation;
	String to_name;
	String folder_id;
	boolean authenticate;
	boolean auto_footer;
	boolean inline_css;
	boolean auto_tweet;
	boolean fb_comments;
	boolean timewarp;
	long template_id;
	boolean drag_and_drop;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isUse_conversation() {
		return use_conversation;
	}
	public void setUse_conversation(boolean use_conversation) {
		this.use_conversation = use_conversation;
	}
	public String getTo_name() {
		return to_name;
	}
	public void setTo_name(String to_name) {
		this.to_name = to_name;
	}
	public String getFolder_id() {
		return folder_id;
	}
	public void setFolder_id(String folder_id) {
		this.folder_id = folder_id;
	}
	public boolean isAuthenticate() {
		return authenticate;
	}
	public void setAuthenticate(boolean authenticate) {
		this.authenticate = authenticate;
	}
	public boolean isAuto_footer() {
		return auto_footer;
	}
	public void setAuto_footer(boolean auto_footer) {
		this.auto_footer = auto_footer;
	}
	public boolean isInline_css() {
		return inline_css;
	}
	public void setInline_css(boolean inline_css) {
		this.inline_css = inline_css;
	}
	public boolean isAuto_tweet() {
		return auto_tweet;
	}
	public void setAuto_tweet(boolean auto_tweet) {
		this.auto_tweet = auto_tweet;
	}
	public boolean isFb_comments() {
		return fb_comments;
	}
	public void setFb_comments(boolean fb_comments) {
		this.fb_comments = fb_comments;
	}
	public boolean isTimewarp() {
		return timewarp;
	}
	public void setTimewarp(boolean timewarp) {
		this.timewarp = timewarp;
	}
	public long getTemplate_id() {
		return template_id;
	}
	public void setTemplate_id(long template_id) {
		this.template_id = template_id;
	}
	public boolean isDrag_and_drop() {
		return drag_and_drop;
	}
	public void setDrag_and_drop(boolean drag_and_drop) {
		this.drag_and_drop = drag_and_drop;
	}
	@Override
	public String toString() {
		return "MailChimpSettings [title=" + title + ", use_conversation=" + use_conversation + ", to_name=" + to_name
				+ ", folder_id=" + folder_id + ", authenticate=" + authenticate + ", auto_footer=" + auto_footer
				+ ", inline_css=" + inline_css + ", auto_tweet=" + auto_tweet + ", fb_comments=" + fb_comments
				+ ", timewarp=" + timewarp + ", template_id=" + template_id + ", drag_and_drop=" + drag_and_drop + "]";
	}
	public MailChimpSettings() {
	}

	
	
}