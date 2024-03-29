package com.day6;

public class Laptop extends Product{
	
	double screenSize;
	int ram;
	int ssd;
	double processer;
	int laptopInventory;
	

	
	public Laptop (int id, String name, double price, int laptopInventory){

		this.id =id;
		this.name=name;
		this.price=price;
		this.laptopInventory=laptopInventory;
		
		
	}
	
	public void addLaptopInventory(int laptopinventory) {
		this.laptopInventory= this.laptopInventory+laptopinventory;
			
		
	}
	
	public int saleLaptop(int laptopinventory) {
		this.laptopInventory=this.laptopInventory-laptopinventory;
		return laptopinventory;
		
	}
	
	public int checkInventoryLaptop() {
		return this.laptopInventory;
		
	}
	
	
				
		
	public Laptop() {
		System.out.println();
	}


	public boolean equals(Laptop Laptop) {
		return (Laptop.id==this.id) && (Laptop.ram==this.ram)&& (Laptop.ssd==this.ssd)&& (Laptop.processer==this.processer);
		       
		      	
	}
	
	public static void main(String[] args) {
		
		Laptop a = new Laptop();
		a.setId(234);
		a.setName("John");
		a.setPrice(2500);
		a.setRating(4.9);
		a.setScreenSize(17.2);
		a.setRam(12);
		a.setSsd(64);
		a.setProcesser(2.5);
		System.out.println(a.getId());
		System.out.println(a.getName());
		System.out.println(a.getPrice());
		System.out.println(a.getRating());
		System.out.println(a.getScreenSize());
		System.out.println(a.getRam());
		System.out.println(a.getSsd());
		System.out.println(a.getProcesser());
		
	}
	
	

	public int getlaptopInventory() {
		return laptopInventory;
	}
	public void setlaptopInventory(int laptopInventory) {
		this.laptopInventory = laptopInventory;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getScreenSize() {
		return screenSize;
	}


	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}


	public int getRam() {
		return ram;
	}


	public void setRam(int ram) {
		this.ram = ram;
	}


	public int getSsd() {
		return ssd;
	}


	public void setSsd(int ssd) {
		this.ssd = ssd;
	}


	public double getProcesser() {
		return processer;
	}


	public void setProcesser(double processer) {
		this.processer = processer;
	}
	
	 @Override
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Price: $" + price+ ", Quantity: " + laptopInventory;
	    }
	
		
		
		
	

}
