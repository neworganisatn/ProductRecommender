package com.rahul.app.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.rahul.app.model.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class productListCreator {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		
		try {

			List<Product> products = new ArrayList<>();
			Product p1 = new Product();
			p1.setName("iPhone6s");
			p1.setPrice("699");
			p1.setImageLink("images/iphone6s.jpeg");
			p1.setLink("http://www.bestbuy.com/site/apple-iphone-6s-plus-64gb-space-gray-at-t/4443518.p?id=1219748973158&skuId=4443518");
	        
			Product p2 = new Product();
			p2.setName("GalaxyS7");
			p2.setPrice("699");
			p2.setImageLink("images/GalaxyS7.jpeg");
			p2.setLink("http://www.bestbuy.com/site/samsung-galaxy-s7-32gb-black-onyx-at-t/4897502.p?id=bb4897502&skuId=4897502");
			products.add(p1);
			products.add(p2);
			String content = mapper.writeValueAsString(products);

	        File file = new File("src/main/java/resourse/products.txt");

	        // if file doesnt exists, then create it
	        if (!file.exists()) {
	            file.createNewFile();
	        }

	        FileWriter fw = new FileWriter(file.getAbsoluteFile());
	        BufferedWriter bw = new BufferedWriter(fw);
	        bw.write(content);
	        bw.close();

	        System.out.println("Done");

	    } catch (IOException e) {
	        e.printStackTrace();
	    }


	}

}
