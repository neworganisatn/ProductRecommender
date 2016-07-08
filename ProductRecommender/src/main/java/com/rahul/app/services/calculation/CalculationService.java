package com.rahul.app.services.calculation;

import java.util.List;

import org.springframework.util.StringUtils;

import com.rahul.app.dto.CalInputReqDto;
import com.rahul.app.dto.CalResDto;



public class CalculationService {
	
	public CalResDto calculate(CalInputReqDto req){
		
		CalResDto response = new CalResDto();
		response.setOperation(req.getOperation());
		response.setValues(req.getValues());
		
		response.setResultValue(calculateResult(req.getValues(), req.getOperation()));
		return response;
		
	}
	
	private Number calculateResult(List<Number> values, String operation){
	
		Number resultValue= null;
		boolean firstValue = true;
		if(StringUtils.pathEquals(operation, "+")){
			for(Number n:values){
				if(firstValue){
					resultValue = n;
					firstValue =false;
				}else{
					resultValue = addition(resultValue, n);
				}
			}
			
		}else if(StringUtils.pathEquals(operation, "-")){
			for(Number n:values){
				if(firstValue){
					resultValue = n;
					firstValue =false;
				}else{
					resultValue = SubStraction(resultValue, n);
				}
			}
			
		}else if(StringUtils.pathEquals(operation, "*")){
			for(Number n:values){
				if(firstValue){
					resultValue = n;
					firstValue =false;
				}else{
					resultValue = multiplication(resultValue, n);
				}
			}
			
		}else if(StringUtils.pathEquals(operation, "/")){
			for(Number n:values){
				if(firstValue){
					resultValue = n;
					firstValue =false;
				}else{
					resultValue = division(resultValue, n);
				}
			}
			
		}else if(StringUtils.pathEquals(operation, "%")){
			for(Number n:values){
				if(firstValue){
					resultValue = n;
					firstValue =false;
				}else{
					resultValue = modulus(resultValue, n);
				}
			}
			
		}else{
		return null;
		}
		
		return resultValue;
	}
	
	private Number addition(Number a, Number b){
		return a.floatValue()+b.floatValue();
		
	}
	private Number SubStraction(Number a, Number b){
		return a.floatValue()-b.floatValue();
		
	}
	private Number multiplication(Number a, Number b){
		return a.floatValue()*b.floatValue();
		
	}
	private Number division(Number a, Number b){
		return a.floatValue() / b.floatValue();
		
	}
	private Number modulus(Number a, Number b){
		return a.floatValue() % b.floatValue();
		
	}
	
	
}
