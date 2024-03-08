package com.day3;

public class House {

	String type;
	String address;
	int Norooms;
	int age;
	int Price;
	
	public void rent() {
		System.out.println("my house is rented");
	}
	public void sell() {
		System.out.println("My house is sold");	
	}
	
	public void changePrice(int updatedprice) {
		Price = updatedprice;
		
	}
	
	
}
