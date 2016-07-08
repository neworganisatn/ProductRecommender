package com.rahul.app.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahul.app.dto.CalInputReqDto;
import com.rahul.app.dto.CalOpeartionReqDto;
import com.rahul.app.dto.CalResDto;
import com.rahul.app.model.Product;
import com.rahul.app.model.User;
import com.rahul.app.services.calculation.CalculationService;
import com.rahul.app.utils.ApplicationContstant;
import com.rahul.app.utils.ProductProducer;

@Controller
@RequestMapping(value = "/calculation")
public class CalculationController {
	
	@Autowired
	private CalculationService calculationSer;

	@RequestMapping( method = RequestMethod.GET)
	public String calOpeartionRequest(Map<String, Object> model) {
		CalOpeartionReqDto req = new CalOpeartionReqDto();
		
		model.put("calOpeartionReqDto", req);
		model.put("operationList", ApplicationContstant.calculatorOperations.split(","));

		return "calOpeartionReq";
	}
	
	@RequestMapping(value ="/request", method = RequestMethod.POST)
	public String calInputValuesRequest(@ModelAttribute("calOpeartionReqDto") CalOpeartionReqDto reqDto, Map<String, Object> model) {
		CalInputReqDto calInputReqDto = new CalInputReqDto();
		calInputReqDto.setOperation(reqDto.getOperation());
		List<Number> values = new ArrayList<>();
		for(int i =1; i <= reqDto.getValueCount().intValue(); i++){
			values.add(0);
		}
		calInputReqDto.setValues(values);
		
		model.put("calInputReqDto", calInputReqDto);

		return "calValueReq";
	}
	
	@RequestMapping(value ="/processValues", method = RequestMethod.POST)
	public String calculation(@ModelAttribute("calInputReqDto") CalInputReqDto reqDto, Map<String, Object> model) {
		model.put("calResDto", calculationSer.calculate(reqDto));	
		return "calResult";
		
	}

	
}
