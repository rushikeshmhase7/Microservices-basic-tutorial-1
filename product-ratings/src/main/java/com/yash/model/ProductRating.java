package com.yash.model;

public class ProductRating {

	private String  productId;
	private int ratings;
	
	public ProductRating(String productId, int ratings) {
		super();
		this.productId = productId;
		this.ratings = ratings;
	}
	
	public ProductRating() {
		
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "ProductRating [productId=" + productId + ", ratings=" + ratings + "]";
	}
	
	
	
	
}
