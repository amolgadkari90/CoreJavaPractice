package com.practice.collections.comparison.comparator.productsorting;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ProductDriver {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("Laptop", new BigDecimal("50000.01")));
		products.add(new Product("Mouse", new BigDecimal("1000.11")));
		products.add(new Product("Monitor", BigDecimal.valueOf(15000.51)));
		products.add(new Product("Keyboard",BigDecimal.valueOf(2000.99)));
		
		Collections.sort(products, new ProductComparatorByPrice());
		
		for(Product p : products) {
			System.out.println(p.name + "   " + p.price);
		}

	}

}
