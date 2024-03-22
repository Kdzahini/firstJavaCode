package com.day6;

import java.util.List;
import java.util.ArrayList;
public class Inventory {

	
	private List<Laptop> laptops = new ArrayList<Laptop>();
	private List<Table> tables = new ArrayList<Table>();
	private List<Light> lights = new ArrayList<Light>();

    public void Inventory1() {
        laptops = new ArrayList<>();
    }
    
    public void Inventory2() {
        tables = new ArrayList<>();
    }
    
    public void Inventory3() {
        lights = new ArrayList<>();
    }
   

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }
    

    public void addTable(Table table) {
        tables.add(table);
    }
    

    public void addLight(Light light) {
        lights.add(light);
    }

    public void removeLaptop(int laptopId) {
        laptops.removeIf(laptop -> laptop.getId() == laptopId);
    }
    
    public void removeTable(int tableId) {
        tables.removeIf(table -> table.getId() == tableId);
    }
    
    public void removeLight(int lightId) {
        lights.removeIf(light -> light.getId() == lightId);
    }

    public Laptop getLaptopById(int laptopId) {
        for (Laptop laptop : laptops) {
            if (laptop.getId() == laptopId) {
                return laptop;
            }
        }
        return null;
    }
    
    public Table getTableById(int tableId) {
        for (Table table : tables) {
            if (table.getId() == tableId) {
                return table;
            }
        }
        return null;
    }
    
    public Light getLightById(int lightId) {
        for (Light light : lights) {
            if (light.getId() == lightId) {
                return light;
            }
        }
        return null;
    }

    public void updateLaptop(int laptopId, double newPriceLaptop, int newQuantityLaptop) {
        Laptop laptop = getLaptopById(laptopId);
        if (laptop != null) {
            laptop.setPrice(newPriceLaptop);
            laptop.setlaptopInventory(newQuantityLaptop);
        } else {
            System.out.println("Product not found.");
        }
    }
    
    public void updateTable(int tableId, double newPriceTable, int newQuantityTable) {
        Table table = getTableById(tableId);
        if (table != null) {
            table.setPrice(newPriceTable);
            table.settableInventory(newQuantityTable);
        } else {
            System.out.println("Product not found.");
        }
    }
    
    public void updateLight(int lightId, double newPriceLight, int newQuantityLight) {
        Light light = getLightById(lightId);
        if (light != null) {
            light.setPrice(newPriceLight);
            light.setlightInventory(newQuantityLight);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayLaptopInventory() {
        System.out.println("Laptop Inventory:");
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }
    
    public void displayTableInventory() {
        System.out.println("Table Inventory:");
        for (Table table : tables) {
            System.out.println(table);
        }
    }
    
    public void displayLightInventory() {
        System.out.println("Light Inventory:");
        for (Light light : lights) {
            System.out.println(light);
        }
    }

}
