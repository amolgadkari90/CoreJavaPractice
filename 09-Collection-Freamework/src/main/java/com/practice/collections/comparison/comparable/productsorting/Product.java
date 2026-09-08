package com.practice.collections.comparison.comparable.productsorting;

class Product implements Comparable<Product> {
	
	int productId;
	String productName;
	double price;
	
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	@Override
	public int compareTo(Product p) {
		
		return Double.compare(this.price, p.price);		
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}
