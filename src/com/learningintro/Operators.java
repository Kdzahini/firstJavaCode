package com.learningintro;

public class Operators {

	public static void main(String[] args) {
		
		
		
//      5 types of operators
//      1. Arthmetic operators
//		            +, -, /, *, ++, --, %
//		2. Assignment Operators
//		            =, +=, -=, *=, /=, &=,|=, ^=, >>=, <<=
//		3. Comparison Operators
//		             ==,!=, >, <, >=, <=
//		4. Logical Operators
//		             &&, ||, !
//		5. Bitwise Operators
		
		int a = 10;
		int b=20;
		int sum = a+b;
		System.out.println(sum);
		
		int mul=a*b;
		
		System.out.println(mul);
		
		double div = (double)a/b;
		
		System.out.println(div);
		
		a++;
		
		System.out.println(a);
		
		b--;
		System.out.println(b);
		
		double rem = a%b;
		
		System.out.println(b);
		
		int c = 10;
		int d = 10;
		
		d += 10; // d= d+10
		
		d -= 5; // d= d-5
		d *= 2; // d= d*2
		d /= 3; // d= d/3
		
		
		System.out.println(d);
		
		c=5;
		
		System.out.println(c==d); // equal
		System.out.println(c!= d); //  not equal
		System.out.println(c > d);
		
		
		// and &&     condition1 && condition2 =>true
		//              true          true
		
		//or   ||       condition1 || condition2 => true
		//                true          false   
		//                 false        true
		//                   true       true
		
		
		// not !         ! (condition1)
//		                  ! (true) => false
		//                 ! (False) => True
		
		
		

	}

}
