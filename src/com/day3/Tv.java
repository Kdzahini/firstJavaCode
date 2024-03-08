package com.day3;

public class Tv {
	String type;
	String model;
	double os;
	int size;
	int mfgYear;
	double specs;
	String color;
	
	public void ChangeChannel () {
		System.out.println ("My tv changed channel");
	}
	
	public void swich() {
		System.out.println("my Tv can not swich");
	}

	public void operations() {
		System.out.println("My Tv does not operate M");
		
	}
	public void volume() {
		System.out.println("My Tv can not change volume");
	}
	
	public double operation(double a) {
		double sum=a;
		return sum;
		
		
	}
	public String giveMeTvName(String name) {
		return name;
	}
	public int volume2(int a) {
		int sum =a;
		return sum;
	}
	public void changeColor(String updatedcolor) {
		color=updatedcolor;
	}
	public void changeMileage(int updatedmfgYear) {
		mfgYear=updatedmfgYear;
	}
	
}
