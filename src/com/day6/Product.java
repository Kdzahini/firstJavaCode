package com.day6;

public class  Product {
	int id;
	String name;
	double price;
	double rating;
	
	
	public static void main(String[] args) {
		Product a = new Product();
		a.setId(234);
		a.setName("Ranwy");
		a.setPrice(2500);
		a.setRating(4.9);
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getPrice());
		System.out.println(a.getRating());
				
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	
	
	
}
