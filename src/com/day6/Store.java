package com.day6;


import java.util.Scanner;


public class Store {

	public static void main(String[] args) {
	
		
		
		System.out.println("Welcome to Kwami Store");
		
	     
		
		Scanner sc = new Scanner (System.in);
		Inventory inventory = new Inventory();
		
		int option = 0;
		boolean exit = false;
		while(!exit) {
			
			System.out.println("1. Add, Remove and update items");
			System.out.println("2. Check Inventory");
			System.out.println("3. Exit");
			
			option = sc.nextInt();
			sc.nextLine();
			switch(option) {
			
			case 1: 
				
				boolean doNotAddItem = false;
				while (!doNotAddItem) {
					
					System.out.println("1. Add Laptop");
					System.out.println("2. Remove Laptop");
					System.out.println("3. Update Laptop");
					System.out.println("4. Add Table");
					System.out.println("5. Remove Table");
					System.out.println("6. Update Table");
					System.out.println("7. Add Light");
					System.out.println("8. Remove Light");
					System.out.println("9. Update Light");
					int choice = sc.nextInt();
					sc.nextLine(); 
					
					
					switch(choice) {
					
					case 1:
						
						
						System.out.println("Add Laptop");
						sc.nextLine();
						
						System.out.println("id");
						int id1= sc.nextInt();
						sc.nextLine();
						
						System.out.println("name");
						String name1 = sc.nextLine();
						

						System.out.println("price");
						double price1= sc.nextDouble();
						sc.nextLine();
						
						System.out.println(" Quantity");
						int laptopInventory= sc.nextInt();
						sc.nextLine();
						
						inventory.addLaptop( new Laptop(id1, name1, price1, laptopInventory));
										
						System.out.println("Do you want to exit add item menu");					
						doNotAddItem = sc.nextBoolean();
						sc.nextLine();
						
						break;
						
						
					case 2: 
						

						System.out.println("Remove Laptop");
						sc.nextLine();
						
						System.out.println(" Enter Laptop ID to remove");
						int laptopIdToRemove = sc.nextInt();
						sc.nextLine();
						inventory.removeLaptop(laptopIdToRemove);
						
						System.out.println("Do you want to exit remove item menu");					
						doNotAddItem = sc.nextBoolean();
						sc.nextLine();
						break;
						
						
					case 3:
						

						System.out.println("Update Laptop");
						sc.nextLine();
						
						System.out.println(" Enter Laptop ID to update");
						int laptopIdToUpdate = sc.nextInt();
						sc.nextLine();
						
						System.out.print("Enter new price: ");
	                    double newPriceLaptop = sc.nextDouble();
	                    sc.nextLine();
	                    inventory.updateLaptop(laptopIdToUpdate, newPriceLaptop, option);
	                    
	                    
	                    System.out.println("Do you want to exit update item menu");					
						doNotAddItem = sc.nextBoolean();
						sc.nextLine();
						break;
	                    
						
					case 4: 
						
						System.out.println("Add Table");
						sc.nextLine();
						
						System.out.println("id");
						int id2= sc.nextInt();
						sc.nextLine();
						
						System.out.println("name");
						String name2 = sc.nextLine();
						

						System.out.println("price");
						double price2= sc.nextDouble();
						sc.nextLine();
						
						System.out.println(" Quantity");
						int tableInventory= sc.nextInt();
						sc.nextLine();
						inventory.addTable(new Table(id2, name2, price2, tableInventory));
						
                        System.out.println("Do you want to exit add item menu");
                        doNotAddItem = sc.nextBoolean();
						sc.nextLine();
						break;
						
					case 5:
						
						System.out.println("Remove Table");
						sc.nextLine();
						
						System.out.println(" Enter Table ID to remove");
						int tableIdToRemove = sc.nextInt();
						sc.nextLine();
						inventory.removeTable(tableIdToRemove);
						
						System.out.println("Do you want to exit remove item menu");					
						doNotAddItem = sc.nextBoolean();
						sc.nextLine();
						break;
						
					case 6:
						
						System.out.println("Update Table");
						sc.nextLine();
						
						System.out.println(" Enter Laptop ID to update");
						int tableIdToUpdate = sc.nextInt();
						sc.nextLine();
						
						System.out.print("Enter new price: ");
	                    double newPriceTable = sc.nextDouble();
	                    sc.nextLine();
	                    inventory.updateTable(tableIdToUpdate, newPriceTable, option);
	                    
	                    System.out.println("Do you want to exit update item menu");					
						doNotAddItem = sc.nextBoolean();
						sc.nextLine();
						break;
						
						
						
					case 7:
						
						System.out.println("Add Light");
						sc.nextLine();
						
						System.out.println("id");
						int id3= sc.nextInt();
						sc.nextLine();
						
						System.out.println("name");
						String name3 = sc.nextLine();
						

						System.out.println("price");
						double price3= sc.nextDouble();
						sc.nextLine();
						
						
						System.out.println(" Quantity");
						int lightInventory= sc.nextInt();
						sc.nextLine();
						
						inventory.addLight(new Light(id3, name3, price3, lightInventory));
						
                        System.out.println("Do you want to exit add item menu");
						doNotAddItem = sc.nextBoolean();
						sc.nextLine();
						
						break;
						
					case 8:
						
						System.out.println("Remove Light");
						sc.nextLine();
						
						System.out.println(" Enter Light ID to remove");
						int lightIdToRemove = sc.nextInt();
						sc.nextLine();
						inventory.removeLight(lightIdToRemove);
						
						System.out.println("Do you want to exit remove item menu");					
						doNotAddItem = sc.nextBoolean();
						sc.nextLine();
						break;
						
					case 9:
						
						System.out.println("Update light");
						sc.nextLine();
						
						System.out.println(" Enter Light ID to update");
						int lightIdToUpdate = sc.nextInt();
						sc.nextLine();
						
						System.out.print("Enter new price: ");
	                    double newPriceLight = sc.nextDouble();
	                    sc.nextLine();
	                    inventory.updateLight(lightIdToUpdate, newPriceLight, option);
	                    
	                    System.out.println("Do you want to exit update item menu");					
						doNotAddItem = sc.nextBoolean();
						sc.nextLine();
						break;
					}
					
				}
						
						
				
			case 2: 
				int option3 =0;
				boolean doNotCheckInventory = false;
				while (!doNotCheckInventory) {
					
					System.out.println("1. Check Laptop Inventory");
					System.out.println("2. Check Table Inventory");
					System.out.println("3. Check Light Inventory");	
					option3 = sc.nextInt();
					sc.nextLine();
					switch(option3) {
					
					case 1:
						
						
						inventory.displayLaptopInventory();
								
						System.out.println("Do you want to exit inventory menu?");
						doNotCheckInventory = sc.nextBoolean();
						sc.nextLine();
						break;
						
					case 2:
						
						
						
						inventory.displayTableInventory();
				
						System.out.println("Do you want to exit inventory menu?");
						doNotCheckInventory = sc.nextBoolean();
						sc.nextLine();
						
						break;
						
					case 3:
						
						
						inventory.displayLightInventory();
						
						System.out.println("Do you want to exit inventory menu?");
							
						doNotCheckInventory = sc.nextBoolean();
						sc.nextLine();
						break;
					
					}
				}
				
			case 3: 
				System.out.println("Do you want to exit store?");
				exit = sc.nextBoolean();
				sc.nextLine();
		
				break ;
			}
		}
			
						

			
				System.out.println("****************Thank you shopping with us*******************");
				
			
				
						
					
						
						
						
					
							
					
						
						
						
						
						
					
			
			}

	private static Laptop Laptop(int id1, String name1, double price1, int laptopInventory) {
		// TODO Auto-generated method stub
		return null;
	}
			
			
	}
	

	


