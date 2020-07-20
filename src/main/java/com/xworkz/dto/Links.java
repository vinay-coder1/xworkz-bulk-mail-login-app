package com.xworkz.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Links implements Serializable {

	private static final long serialVersionUID = 1L;

	private String rel;
	private String href;
	private String method;
	private String targetSchema;
	private String schema;

	public Links() {
	}

}