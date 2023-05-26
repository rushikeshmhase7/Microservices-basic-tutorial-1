package com.yash.model;

public class ProductItem {
	private String productName;
	private double price;
	private String desc;
	private double ratings;
	
	public ProductItem() {
		
	}
	
	public ProductItem(String productName, double price, String desc, double ratings) {
		super();
		this.productName = productName;
		this.price = price;
		this.desc = desc;
		this.ratings = ratings;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public double getRatings() {
		return ratings;
	}


	public void setRatings(double ratings) {
		this.ratings = ratings;
	}


	@Override
	public String toString() {
		return "ProductItem [productName=" + productName + ", price=" + price + ", desc=" + desc + ", ratings="
				+ ratings + "]";
	}
	
	

}
