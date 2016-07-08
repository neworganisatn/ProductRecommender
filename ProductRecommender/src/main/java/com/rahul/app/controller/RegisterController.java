package com.rahul.app.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahul.app.model.Product;
import com.rahul.app.model.User;
import com.rahul.app.utils.ApplicationContstant;
import com.rahul.app.utils.ProductProducer;

@Controller
@RequestMapping(value = "/search")
public class RegisterController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
		User userForm = new User();
		model.put("userForm", userForm);

		String[] ageList = {ApplicationContstant.Age_1_10,
				ApplicationContstant.Age_11_18 ,
				ApplicationContstant.Age_19_26 ,
				ApplicationContstant.Age_27_39,
				ApplicationContstant.Age_40_50 ,
				ApplicationContstant.Age_50_Above};
		
		String[] genderList = { "M", "F" };
		String[] priceList = {"50", "100", "200", "300", "400", "500", "700" };
		String[] productCategoryList = {};

		model.put("ageList", ageList);
		model.put("genderList", genderList);
		model.put("priceList", priceList);
		model.put("productCategoryList", productCategoryList);

		return "search";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("userForm") User user, Map<String, Object> model)
			throws FileNotFoundException {

		try {

			// String path = "resources/products.txt";
			// String productsString = new
			// String(Files.readAllBytes(Paths.get(path)));
			//
			// //file Product
			// Product[] products = new ObjectMapper().readValue(productsString,
			// Product[].class);
			//
			// //analise usr ip
			//
			// //select some product
			//
			// //add those products to new list
			// ProductRecommender/src/main/webapp/WEB-INF/views/images/iphone6s.jpeg
			
			List<Product> displayList = new ArrayList<Product>();
			for (Product product : new ProductProducer().getProducts()) {

				if (StringUtils.pathEquals(user.getGender(), product.getTargetGender())) {
					if (product.getTargetAge().equals(user.getAge())) {
						if (Long.valueOf(product.getPrice()).longValue() <= Long.valueOf(user.getPriceRange())
								.longValue()) {
							displayList.add(product);
						}
					}
				}

			}

			model.put("productList", displayList);

		} catch (Exception ee) {
			System.out.println(ee.getMessage());
		}
		return "results";
	}
}
