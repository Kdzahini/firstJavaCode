package com.learningintro;

public class Dataclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// In Java two datatypes
		//                        - Primitive Data type
		//                        - Non-primitive Data type
		
		
		//  8 primitive data types
		
//       1. byte         - 1byte                - 128 to 127
//       2. short        - 2bytes               - 32768 to 32767
//       3. int          - 4bytes               - 2,147,483,648 to 2,147,483,647
//       4. long         -8bytes                - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 
//       5. fleat        - 4bytes                    store up to 6 to 7 decimal digits           ex:12.2222222
		
//       6. double       - 8 bytes                   store up to 15 decimal digits ex: 12.222222222345678
//       7. boolean      - 1 bit                     true or false
//       8. char         - 2 bytes                   signle charactor
		
//       Non- primitive Data types
//		  - string 
		                
//       Syntax of variable
		
//       type name  = value;
		 
		final   byte count = 120;
		   boolean option = true;
		   int a = 100000;
		   long b = 142777;
		   double c = 10.571;
		   float d = 10.67f;
		   char e = 'g';
		   short f = 123;
		   
		   System.out.println(count);
//		   count = 20;
		   a=1;
		   System.out.println(count);
		   
		   
		   
//		   type casting 
		   
//		   wideing casting    - automatically  -> converting smaller type to lager type
//         byte -> short -> int -> long -> float -> double
		   
		   byte value = 10;
		   
		   int anothervalue = value;
		   
		   System.out.println(value);
		   System.out.println(anothervalue);
		   
		   value  = 20;
		  
		   System.out.println(value);
		   System.out.println(anothervalue);
		   
//         Narrowing Casting  - manually  larger type to smaller type 
//		   byte -> short -> int -> long -> float -> double
		   
				   
		   
		   
		   
		                                         
		
		


	}

}
