package com.day6;

public class Light extends Product{
	
	double wats;
	int lumens;
	
	public Light (int id, String name, double price, double rating, double wats, int lumens) {
		this.id =id;
		this.name=name;
		this.price=price;
		this.rating=rating;
		this.wats=wats;
		this.lumens=lumens;
	
	}
	
	public Light() {
		System.out.println();
	}

	public boolean equals(Light Light) {
		return (Light.id ==this.id)&& (Light.wats ==this.wats)&& (Light.lumens ==this.lumens);
	}
	
	public static void main(String[] args) {
		Light a = new Light();
		a.setId(234);
		a.setName("Koffi");
		a.setPrice(2500);
		a.setRating(4.9);
		a.setWats(2.5);
		a.setLumens(3000);
		
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getPrice());
		System.out.println(a.getRating());
		System.out.println(a.getWats());
		System.out.println(a.getLumens());
		
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

	public double getWats() {
		return wats;
	}

	public void setWats(double wats) {
		this.wats = wats;
	}

	public int getLumens() {
		return lumens;
	}

	public void setLumens(int lumens) {
		this.lumens = lumens;
	}
		
	

}
