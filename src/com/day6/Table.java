package com.day6;

public class Table extends Product{
	
	double height;
	double width;
	double length;
	int tableInventory;
	
	public Table (int id, String name, double price, int tableInventory) {
		this.id =id;
		this.name=name;
		this.price=price;
		this.tableInventory=tableInventory;
		
	}
	
	
	public void addtableInventory(int tableinventory) {
		this.tableInventory= this.tableInventory+tableinventory;
			
		
	}
	
	public int saleTable(int tableinventory) {
		this.tableInventory=this.tableInventory-tableinventory;
		return tableinventory;
		
	}
	
	public int checkInventoryTable() {
		return this.tableInventory;
		
	}
	
	
	public Table() {
		System.out.println();
	}

	public boolean equals(Table Table) {
		return (Table.id==this.id) && (Table.length==this.length)&& (Table.height==this.height)&& (Table.width==this.width) ;
		       
		      	
	}
		public static void main(String[] args) {
			Table a = new Table();
			a.setId(234);
			a.setName("wasty");
			a.setPrice(2500);
			a.setRating(4.9);
			a.setHeight(23.3);
			a.setWidth(4.5);
			a.setLength(4.6);
			
			System.out.println(a.getId());
			System.out.println(a.getName());
			System.out.println(a.getPrice());
			System.out.println(a.getRating());
			System.out.println(a.getHeight());
			System.out.println(a.getWidth());
			System.out.println(a.getLength());
	
		}

		public int gettableInventory() {
			return tableInventory;
		}
		public void settableInventory(int tableInventory) {
			this.tableInventory = tableInventory;
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
		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getWidth() {
			return width;
		}

		public void setWidth(double width) {
			this.width = width;
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}
		
		 @Override
		    public String toString() {
		        return "ID: " + id + ", Name: " + name + ", Price: $" + price + ", Quantity: " + tableInventory;
		    }
			
		 
		
		      	
	}
		
	


