package com.learningintro4;

public class Interclass4 {

	public static void main(String[] args) {
		//break, continue
		//dont print after 53
		
		for(int i=0; i<=100; i++) {
			System.out.println(i);
			if(i==53){
			break;	
			}
		}
		
		//.............................................
		//do not print multiple of 5
		for(int i=0; i<=100; i++) {
			if(i% 5 == 0){
				continue;
			}
			System.out.println(i);
		}
		
//System.out.println("------------------------------------");
//System.out.print("hello");

// * * * * *
// * * * *
// * * *
// * *
// *

for(int i =1; i<=5; i++) {
	for(int j =1; j<=5-(i-1); j++ ) {
		System.out.print("* ");
	}
	System.out.println();
}

for(int k=5; k>=1; k--) {
	for(int l=1; l<=5-(k-1);l++) {
		System.out.print("* ");
	}
	System.out.println();
}

for(int m=1; m<=5; m++) {
	for(int n=5-(m-1); n>=1;n--) {
		System.out.print(" *");
	}
	System.out.println();
}

int v=2023;
if(v%4==0) {
	while (v<=2100)
		System.out.println("it is a leap year");
	v=v+4;
}

	}

}
