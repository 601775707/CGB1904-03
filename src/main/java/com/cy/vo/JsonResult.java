package com.cy.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class JsonResult implements Serializable{
	private static final long serialVersionUID = -8364619171691864321L;
	private int state = 1;//1 ok,0 error
	private String message = "ok";
	private Object content;
	
	public JsonResult() {
		
	}
	
	public JsonResult(String message) {
		this.message = message;
	}
	
	public JsonResult(Object content) {
		this.content = content;
	}
	
	public JsonResult(Throwable e) {
		this.message = e.getMessage();
		this.state = 0;
	}
}
