package com.rahul.app.dto;

import java.util.List;

public class CalInputReqDto {
	
	private String operation;
	private List<Number> values;
	
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public List<Number> getValues() {
		return values;
	}
	public void setValues(List<Number> values) {
		this.values = values;
	}
	

}
