package com.practice.collections.comparison.comparable.productsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DriverProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product(101, "Laptop", 50000));
		products.add(new Product(102, "Mouse", 1000));
		products.add(new Product(103, "Keyboard", 2000));
		products.add(new Product(104, "Monitor", 15000));
		
		System.out.println("Unsorted -> ");
		for(Product p : products) System.out.println(p);		
		
		System.out.println("**********************");
		Collections.sort(products);
		for(Product p : products) System.out.println(p);
		

	}

}
