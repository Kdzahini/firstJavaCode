package com.day6;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
Scanner[] NameAry = new Scanner[3];
		
		
		
		System.out.println("Welcome to Kwami Store");
		
	
		
		Scanner sc = new Scanner (System.in);
		
		int option = 0;
		boolean mainstop = false;
		while(!mainstop) {
			
			System.out.println("1. Do you want to login");
			System.out.println("2. Do you want to exit");
			option = sc.nextInt();
			sc.nextLine();
			switch(option) {
			
			case 1: 
				boolean stopCreatingObject = false;
				while (!stopCreatingObject) {
					
					System.out.println("user logged in");
					sc.nextLine();
					System.out.println("*****Laptop*****");
					
					
					Laptop a = new Laptop();
					a.setId(234);
					a.setName("Dell");
					a.setPrice(2500);
					a.setRating(4.9);
					a.setScreenSize(17.2);
					a.setRam(12);
					a.setSsd(64);
					a.setProcesser(2.5);
					System.out.println("id:"+ " " + a.getId());
					System.out.println("Name:" + " " + a.getName());
					System.out.println("Price:" + " " + a.getPrice());
					System.out.println("Rating:" + " " + a.getRating());
					System.out.println("Screen Size:" + " " + a.getScreenSize());
					System.out.println("Ram:" + " " + a.getRam());
					System.out.println("Ssd:" + " " + a.getSsd());
					System.out.println("Processer:" + " " + a.getProcesser());
					sc.nextLine();
					
					System.out.println("Go to main menu");
					
					
					stopCreatingObject = sc.nextBoolean();
					sc.nextLine();		
				}
				stopCreatingObject=true;
				break;
			case 2:
				System.out.println("Exit");
				mainstop =true;
				break ;
			
			}
			
			
		}
		
		
		
		int option1 = 1;
		boolean mainstop1 = false;
		while(!mainstop1) {
			
			System.out.println("1. Do you want to login");
			System.out.println("2. Do you want to exit");
			option1 = sc.nextInt();
			sc.nextLine();
			switch(option1) {
			
			case 1: 
				boolean stopCreatingObject = false;
				while (!stopCreatingObject) {
					
					System.out.println(" *****Light******");
					
					Light a = new Light();
					a.setId(234);
					a.setName("Sunny");
					a.setPrice(2500);
					a.setRating(4.9);
					a.setWats(2.5);
					a.setLumens(3000);
					
					System.out.println("id:" + " " + a.getId());
					System.out.println("Name:" + " " + a.getName());
					System.out.println("Price:" + " " + a.getPrice());
					System.out.println("Rating::" + " " + a.getRating());
					System.out.println("Wats:" + " " + a.getWats());
					System.out.println("Lumen" + " " + a.getLumens());
					sc.nextLine();
					
					System.out.println("Go to main menu");
					
					
					stopCreatingObject = sc.nextBoolean();
					sc.nextLine();		
				}
				stopCreatingObject=true;
				break;
			case 2:
				System.out.println("Exit");
				mainstop1 =true;
				break ;
			
			}
			
			
		}
		
           
		
		int option2 = 2;
		boolean mainstop2 = false;
		while(!mainstop2) {
			
			System.out.println("1. Do you want to login");
			System.out.println("2. Do you want to exit");
			option2 = sc.nextInt();
			sc.nextLine();
			switch(option2) {
			
			case 1: 
				boolean stopCreatingObject = false;
				while (!stopCreatingObject) {
					
					System.out.println(" *****Table******");
					
					
					Table a = new Table();
					a.setId(234);
					a.setName("wasty");
					a.setPrice(2500);
					a.setRating(4.9);
					a.setHeight(23.3);
					a.setWidth(4.5);
					a.setLength(4.6);
					System.out.println("id:" +" " +a.getId());
					System.out.println("Name:" + " " +a.getName());
					System.out.println("price:" + " " +a.getPrice());
					System.out.println("Rating:" + " " + a.getRating());
					System.out.println("Height:" + " " +a.getHeight());
					System.out.println("Width:" + " " + a.getWidth());
					System.out.println("Length:" + " " + a.getLength());
					sc.nextLine();
					
					System.out.println("Go to the main menu");
					
					
					stopCreatingObject = sc.nextBoolean();
					sc.nextLine();		
				}
				stopCreatingObject=true;
				break;
			case 2:
				System.out.println("Exit");
				mainstop2 =true;
				break ;
			
			}
			
			
		}
		

	}

}
