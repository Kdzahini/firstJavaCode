package com.day7;

import java.util.Scanner;

public class Mystore {

	public static void main(String[] args) {
		
		
		
	
		
		Scanner sc = new Scanner (System.in);
		
		int option = 0;
		boolean exit = false;
		while(!exit) {
			
			
			System.out.println("Welcome****What do you need?");
			System.out.println("1. Samsung");
			System.out.println("2. LG");
			System.out.println("3. Sony");
			System.out.println("4. Exit");
			
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			
			case 1: 

					System.out.println("****Type your Samsung Scanner features*****");
					sc.nextLine();
					
					
					System.out.println("scanner id");
					int id= sc.nextInt();
					sc.nextLine();
					
					System.out.println("scanner name");
					String name = sc.nextLine();
					

					System.out.println("scanner price");
					double price= sc.nextDouble();
					sc.nextLine();
					
					System.out.println("scanner rating");
					double rating= sc.nextDouble();
					sc.nextLine();
					
					System.out.println("scanner stand off");
					int standOff= sc.nextInt();
					sc.nextLine();
					
					System.out.println("laser line length");
					int length= sc.nextInt();
					sc.nextLine();
					
					System.out.println(" Max USB scanning rate");
					int scanningRate= sc.nextInt();
					sc.nextLine();
					
					System.out.println(" Automatic Exposure");
					String automaticExposure= sc.nextLine();
					
					System.out.println(" Scanner Line Resolution");
					double lineResolution= sc.nextDouble();
					sc.nextLine();
					
					System.out.println(" Max Data rate");
					int maxDataRate= sc.nextInt();
					sc.nextLine();
					
					System.out.println("scanner accuracy");
					int scannerAccuracy= sc.nextInt();
					sc.nextLine();
					
					System.out.println("scanner weight");
					int weight= sc.nextInt();
					sc.nextLine();
					
					System.out.println("scanner available temperature");
					int temperature= sc.nextInt();
					sc.nextLine();
					
					System.out.println("laser class");
					int laserClass= sc.nextInt();
					sc.nextLine();
					
					System.out.println("cleaning");
					String cleaning= sc.nextLine();
					
					
					
				
					break;
				
				
				
				
			
			case 2: 
				System.out.println("****Type your LG Scanner features*****");
				sc.nextLine();
				
				
				System.out.println("scanner id");
				int id0= sc.nextInt();
				sc.nextLine();
				
				System.out.println("scanner name");
				String name0 = sc.nextLine();
				

				System.out.println("scanner price");
				double price0= sc.nextDouble();
				sc.nextLine();
				
				System.out.println("scanner rating");
				double rating0= sc.nextDouble();
				sc.nextLine();
				
				System.out.println("scanner stand off");
				int standOff0= sc.nextInt();
				sc.nextLine();
				
				System.out.println("laser line length");
				int length0= sc.nextInt();
				sc.nextLine();
				
				System.out.println(" Max USB scanning rate");
				int scanningRate0= sc.nextInt();
				sc.nextLine();
				
				System.out.println(" Automatic Exposure");
				String automaticExposure0= sc.nextLine();
				
				System.out.println(" Scanner Line Resolution");
				double lineResolution0= sc.nextDouble();
				sc.nextLine();
				
				System.out.println(" Max Data rate");
				int maxDataRate0= sc.nextInt();
				sc.nextLine();
				
				System.out.println("scanner accuracy");
				int scannerAccuracy0= sc.nextInt();
				sc.nextLine();
				
				System.out.println("scanner weight");
				int weight0= sc.nextInt();
				sc.nextLine();
				
				System.out.println("scanner available temperature");
				int temperature0= sc.nextInt();
				sc.nextLine();
				
				System.out.println("laser class");
				int laserClass0= sc.nextInt();
				sc.nextLine();
				
				System.out.println("cleaning");
				String cleaning0= sc.nextLine();
				break;
			
			case 3: 
				System.out.println("****Type your Sony Scanner features*****");
				sc.nextLine();
				
				
				System.out.println("scanner id");
				int id1= sc.nextInt();
				sc.nextLine();
				
				System.out.println("scanner name");
				String name1 = sc.nextLine();
				

				System.out.println("scanner price");
				double price1= sc.nextDouble();
				sc.nextLine();
				
				System.out.println("scanner rating");
				double rating1= sc.nextDouble();
				sc.nextLine();
				
				System.out.println("scanner stand off");
				int standOff1= sc.nextInt();
				sc.nextLine();
				
				System.out.println("laser line length");
				int length1= sc.nextInt();
				sc.nextLine();
				
				System.out.println(" Max USB scanning rate");
				int scanningRate1= sc.nextInt();
				sc.nextLine();
				
				System.out.println(" Automatic Exposure");
				String automaticExposure1= sc.nextLine();
				
				System.out.println(" Scanner Line Resolution");
				double lineResolution1= sc.nextDouble();
				sc.nextLine();
				
				System.out.println(" Max Data rate");
				int maxDataRate1= sc.nextInt();
				sc.nextLine();
				
				System.out.println("scanner accuracy");
				int scannerAccuracy1= sc.nextInt();
				sc.nextLine();
				
				System.out.println("scanner weight");
				int weight1= sc.nextInt();
				sc.nextLine();
				
				System.out.println("scanner available temperature");
				int temperature1= sc.nextInt();
				sc.nextLine();
				
				System.out.println("laser class");
				int laserClass1= sc.nextInt();
				sc.nextLine();
				
				System.out.println("cleaning");
				String cleaning1= sc.nextLine();
				break;	
				
			case 4:
			     exit=true;
				break ;
			}
		
			
			if (!exit) {
				System.out.println("Do you want to exit");
				exit  = sc.nextBoolean();
				sc.nextLine(); 
				
			}
		
		
			else {
				System.out.println("****************Thank you*******************");
				
			}
			
		
		
			
			
		}
		
		System.out.println("****************Thank you*******************");
		
	}
				
				
		

}


