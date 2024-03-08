package com.day3;

public class Workspace {

	public static void main(String[] args) {
		
		Car volo = new Car();
		volo.name= "volvo";
		volo.color="gray";
		volo.model= "v60";
		volo.mfgyear = 2020;
		volo.mileage = 30000;
		
		volo.drive();
		volo.stop();
		
		
		Car toyota = new Car();
		
		toyota.name ="camry";
		toyota.color = "blue";
		toyota.mfgyear = 2024;
		toyota.mileage = 0;
		
		System.out.println("volo");
		System.out.println("toyota");
		
		House Condo = new House();
		Condo.type = "Condo";
		Condo.Norooms = 5;
		Condo.age = 10;
		Condo.address = "west county"; 
		Condo.Price = 100;
		
		Condo.sell();
		Condo.rent();
		Condo.changePrice(200);
		
		
		House Appartment= new House();
		Appartment.type = "APT";
		Appartment.Norooms = 2;
		Appartment.age = 5;
		Appartment.address = "East county"; 
				
		Appartment.sell();
		Appartment.rent();
		
		
		House Familly = new House();
		Familly.type = "Familly";
		Familly.Norooms = 4;
		Familly.age = 20;
		Familly.address = "central county";
		
		Familly.changePrice(200);
		Familly.sell();
		Familly.rent();
		
		Tv Samsung = new Tv();
		Samsung.type="Samsung";
		Samsung.model= "SG";
		Samsung.os= 17.3;
		Samsung.size= 52;
		Samsung.mfgYear= 2023;
		Samsung.specs= 8.3;
		Samsung.color="black";
		
		Samsung.changeColor("Blue");
		
		Classroom Java= new Classroom();
		Java.type="Java";
		Java.noofStudent= 001;
		Java.mode="in person";
		Java.course= "Math";
		Java.Status="Present";
		
		System.out.println(Java.giveCourseName("Math"));
		
		
		
		
		
		
		
	
		
			
	   
		   
	   
	
		
		
		
		
		
				
				
		
		
		
	}

}
