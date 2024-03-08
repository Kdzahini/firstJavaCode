package com.day6;

import java.util.Scanner;

public class Scanerintro {

	public static void main(String[] args) {
		// Scanner class is used to get user input
		//its imported from java.util
		
		// scanner object    -> System.in
		//-> next time() String
		//-> nextBoolean()
		//nextInt()
		// --------- -> next()
		
		
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.println("enter first name");
		String fistname= scanner1.nextLine();
		
		System.out.println("enter last name");
		String lastname = scanner1.nextLine();
		
		System.out.println("enter age");
		int age = scanner1.nextInt();
		
		scanner1.nextLine();
		
		System.out.println("enter phone number");
		Long phonenumber = scanner1.nextLong();
		
		scanner1.nextLine();
		
			
		System.out.println("Enter User name ");
		String username = scanner1.nextLine();
		
		System.out.println("Enter DOB ");
		String dob = scanner1.nextLine();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
