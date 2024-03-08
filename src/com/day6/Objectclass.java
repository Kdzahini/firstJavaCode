package com.day6;

public class Objectclass {

	// its a root/parent class for all the objects that are created inside a java
	
	//-> toString()
	//-> equals (Object ob)
	//
	
	public static void main(String[] args) {
		
		Object obj =new Object();
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		
		
		
		
		
		Student Student1= new Student(1, "Joy");
		Student Student2= new Student(2, "byoh");
		Student Student3= new Student(3, "ana");
		
	}
}
