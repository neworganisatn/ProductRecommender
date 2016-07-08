package com.rahul.app.dto;

import java.util.List;

public class CalResDto {

	private String operation;
	private List<Number> values;
	private Number resultValue;
	
	
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
	public Number getResultValue() {
		return resultValue;
	}
	public void setResultValue(Number resultValue) {
		this.resultValue = resultValue;
	}
}
