package com.practice.collections.comparison.comparator.productsorting;

import java.util.Comparator;

class ProductComparatorByPrice implements Comparator<Product> {
	
	@Override
	public int compare(Product p1, Product p2) {
		
		int result = p2.price.compareTo(p1.price);		
		return result;		
	}
}
