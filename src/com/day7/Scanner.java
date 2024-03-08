package com.day7;


public class Scanner {
	Scanner[] NameAry = new Scanner[10];
	int position=0;
	

	int id;
	String name;
	double price;
	double rating;
	int standOff;
	int length;
	int  scanningRate;
	String automaticExposure;
	double lineResolution;
	int maxDataRate;
	int scannerAccuracy;
	int weight;
	int temperature;
	int laserClass;
	String cleaning;
	
	public Scanner (int id, String name, double price, double rating, int standOff , int length, int scanningRate, String automaticExposure, double lineResolution,int maxDataRate, int scannerAccuracy, int weight, int temperature, int laserClass, String cleaning ){

		this.id =id;
		this.name=name;
		this.price=price;
		this.rating=rating;
		this.standOff=standOff;
		this.length=length;
		this.scanningRate=scanningRate;
		this.automaticExposure=automaticExposure;
		this.lineResolution=lineResolution;
		this.maxDataRate=maxDataRate;
		this.scannerAccuracy=scannerAccuracy;
		this.weight=weight;
		this.temperature=temperature;
		this.laserClass=laserClass;
		this.cleaning=cleaning;
		
	}
	public Scanner getNamebyPosition(int position) {
		Scanner requestedName=NameAry[position];
		return requestedName;
		
	}
				
	

}