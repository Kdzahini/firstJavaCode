package com.day3;

public class Calc {

	
	public static void main(String[] args) {
		Calc calc1= new Calc();
		System.out.println(calc1.sum(23, 10, 2.5));
		System.out.println(calc1.sum(10,10, 3.5));
		System.out.println(calc1.sum(23,23, 22.5));
		 double output = calc1.sum(15,15, 4.5);
		
		System.out.println(output);
		
		
		
	}
	
	public double sum1(double a, double b) {
		   double sum = a+b;
		   return sum; 
	}
	//build method to to take 2 int input values 1 double input and return the double sum of them


	 public double sum(int a, int b, double c){
	
		 double sum = a+b+ c;
		 
		 return sum;
		 
	 }
}
