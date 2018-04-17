package com.dev.mmilak.parseJSONFile;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


public class Receipe {
	String title;
	List<String> products, photos;
	String descriptionReceipe, category, price, time, difficulty;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	public String getDescriptionReceipe() {
		return descriptionReceipe;
	}
	public void setDescriptionReceipe(String descriptionReceipe) {
		this.descriptionReceipe = descriptionReceipe;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	public List<String> getPhotos() {
		return photos;
	}
	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}
	

}
