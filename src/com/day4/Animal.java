package com.day4;

public class Animal {
	
	static int noOfAnimalscreated =0;
	static int noOflegs=4;
	
	
	String type;
	String name;
	
	int age;
	
	public Animal( String type, String name, int age) {
		this.type = type;
		this.name = name;
		this.age= age; 
		noOfAnimalscreated++;
	}
			


}
