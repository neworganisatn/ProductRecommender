package com.rahul.app.model;

public class Product {

	private String name;
	private String price;
	private String link;
	private String imageLink;
	private String targetAge;
	private String targetGender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getImageLink() {
		return imageLink;
	}

	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}

	public String getTargetAge() {
		return targetAge;
	}

	public void setTargetAge(String targetAge) {
		this.targetAge = targetAge;
	}

	public String getTargetGender() {
		return targetGender;
	}

	public void setTargetGender(String targetGender) {
		this.targetGender = targetGender;
	}

}
