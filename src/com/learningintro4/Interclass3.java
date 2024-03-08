package com.learningintro4;

public class Interclass3 {

	public static void main(String[] args) {
		// for loop
		//while loop
		//do while loop
		
		//for loop
		
		
// for (statement1: statement2: statement3){
//      body - > code

//	}
		
//		for(initialization; condition ; increment/ decrement) {
		
		//repeting line of code
		
//	}
		
		

		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
			
		//print 10 to 1 using for loop
		for(int i=10; i>=1; i-- ) {
			System.out.println(i);
		}
				
				//232, 234, 236, ....................486
				
		for(int i=232; i <=486; i=i+2) {
		 System.out.println(i);
		}
		
		// 1000, 990, 980, .........500
		
		for(int i=1000; i>=500; i=i-10) {
			System.out.println(i);
		}
	for(int outer=1; outer<=5; outer++) {
		System.out.println("outer");
		for(int inner=1; inner <=3; inner++){
			System.out.println("inner");
		}
	}
			//while logo
			//while(condition)
		//	body
			// initialisation
			//while(condition){
			//body
			//increment / decrement
			//}
			//1,2,3,4, .....10
			int i=1;
			while(i<=10) {
				System.out.println(i);
				i++;
				
			}
			
			//do while
			
			//initialization
			//do{
			//code body
			//}
			//while condition
			
			int a =20;
			
			do {
				System.out.println(a);
				a++;
			}
			while (a<=10);
			
			//-------
			
			int c=1000;
			do {
				System.out.println(c);
				c=c-10;
			
			}while(c>=1);
			
			//........................................................
			
		int d=1;
		while (d<=50){
			if(d%2 ==0) {
				System.out.println("its even" +d);
			}else {
				System.out.println("its odd" +d);
			}
			
			d++;
			
			//.check and print only multiple 3.................................................
			
			int e=1000;
			while (e>=1){
				if(e%3 ==0) {
					System.out.println("e");
				
				}
			}
				
				d++;
		}
		
		
	
		
		
	
			
			
}
}



	
	
	
	
	


