package com.yash.model;

public class Product {

	private String productId;
	private String name;


	public Product(String productId, String name) {
		super();
		this.productId = productId;
		this.name = name;
	}

	
	public Product() {
		
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + "]";
	}
	
	

}
