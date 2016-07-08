package com.rahul.app.utils;
import java.util.ArrayList;
import java.util.List;

import com.rahul.app.model.*;

public class ProductProducer {
	
	public List<Product> getProducts(){
		List<Product> products = new ArrayList<>();
		Product p1 = new Product();
		p1.setName("iPhone6s");
		p1.setPrice("600");
		p1.setImageLink("/images/iphone6s.jpeg");
		p1.setTargetAge(ApplicationContstant.Age_40_50);
		p1.setTargetGender("F");
		p1.setLink(
				"http://www.bestbuy.com/site/apple-iphone-6s-plus-64gb-space-gray-at-t/4443518.p?id=1219748973158&skuId=4443518");
		products.add(p1);
		
		Product p2 = new Product();
		p2.setName("GalaxyS7");
		p2.setPrice("699");
		p2.setImageLink("/images/GalaxyS7.jpeg");
		p2.setTargetGender("M");
		p2.setTargetAge(ApplicationContstant.Age_27_39);
		p2.setLink(
				"http://www.bestbuy.com/site/samsung-galaxy-s7-32gb-black-onyx-at-t/4897502.p?id=bb4897502&skuId=4897502");
		products.add(p2);
		
		Product p3 = new Product();
		p3.setName("Action Figure Hulk");
		p3.setPrice("11");
		p3.setImageLink("http://pisces.bbystatic.com/image2/BestBuy_US/images/products/4266/4266900_sd.jpg;canvasHeight=550;canvasWidth=642");
		p3.setTargetGender("M");
		p3.setTargetAge(ApplicationContstant.Age_27_39);
		p3.setLink(
				"http://www.bestbuy.com/site/hasbro-playmation-marvel-avengers-hulk-hero-smart-figure-green/4266900.p?id=1219714310931&skuId=4266900");
		
		products.add(p3);

		return products;
		
	}

}
