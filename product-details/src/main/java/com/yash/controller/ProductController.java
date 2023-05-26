package com.yash.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

	@GetMapping("/{productId}")
	public Product getProductDetails(@PathVariable("productId") String productId) {
	  
		return new Product(productId, "test");
	}
}
