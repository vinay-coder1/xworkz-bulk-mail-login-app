package com.xworkz.dto;

import java.io.Serializable;

public class Links implements Serializable{
	
	private static final long serialVersionUID = 1L;

	String rel;
	String href;
	String method;
	String targetSchema;
	String schema;

	public Links() {
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getTargetSchema() {
		return targetSchema;
	}

	public void setTargetSchema(String targetSchema) {
		this.targetSchema = targetSchema;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	@Override
	public String toString() {
		return "Links [rel=" + rel + ", href=" + href + ", method=" + method + ", targetSchema=" + targetSchema
				+ ", schema=" + schema + "]";
	}

	

}