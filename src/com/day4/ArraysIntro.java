package com.day4;

public class ArraysIntro {

	public static void main(String[] args) {
		
		// Array size is fixed
		//same datatype can only be stored
		//it will give you certain methods to do certain actions.
		
		//datatype[] arrayVariableName = new datatype[SizeofArray};
		int[] intArray   = new int[5];
		
		
		
		//datatype[] arrayVariableName = {elements};
		int[] intArray2 = {1,2,3,4,5,6};
		
		
		int[]ary1 = {1,2,3,4,5};
		int[]ary2 = {10,20,30,40,50};
		
		
		int[][] combinedArray = {
				{1,2,3,4,5},
				{10,20,30,40,50}
		  
		};
		
		System.out.println(combinedArray[1][4]);
		System.out.println(combinedArray[1][3]);
		System.out.println(combinedArray[1][2]);
		System.out.println(combinedArray[1][1]);
		System.out.println(combinedArray[1][0]);
		
		
	
		System.out.println(combinedArray[0][4]);
		System.out.println(combinedArray[0][3]);
		System.out.println(combinedArray[0][2]);
		System.out.println(combinedArray[0][1]);
		System.out.println(combinedArray[0][0]);
		
 	}

}
