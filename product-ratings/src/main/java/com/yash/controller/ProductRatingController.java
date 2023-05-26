package com.yash.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.ProductRating;

@RestController
@RequestMapping("/rating")
public class ProductRatingController {

	@GetMapping("/{productId}")
	public ProductRating getProductRating(@PathVariable("productId") String productId) {
		return new ProductRating(productId, 5);
	}
	
	
	@GetMapping("/getall")
	public List<ProductRating> getall(){
		return Arrays.asList(new ProductRating("1",3),
				new ProductRating("2",5),
				new ProductRating("3",4)
				);
		
	}

	
	@GetMapping("/get/{productId}")
	public List<ProductRating> getUserRating(@PathVariable("productId") String productId){
		List<ProductRating> ratings=Arrays.asList(new ProductRating("1", 4),
				new ProductRating("2", 5));
		return ratings;
		
	}
}
