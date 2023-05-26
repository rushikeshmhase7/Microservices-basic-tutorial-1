package com.yash.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.yash.model.Product;
import com.yash.model.ProductItem;
import com.yash.model.ProductRating;


@RestController
@RequestMapping("/cart")
public class ProductCartController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@GetMapping("/{userId}")
	public List<ProductItem> getCart(@PathVariable("userId") String userId){
		
		
//		List<ProductItem> li=List.of(new ProductItem("Shirt",2000,"blue color",4.3),
//				new ProductItem("jeans",2700,"red color",5.3),
//				new ProductItem("formal",1000,"black color",2.3));
//		return li;
		

//		RestTemplate restTemplate=new RestTemplate();
		List<ProductRating> rating=Arrays.asList(new ProductRating("1",4));
//		
//		return rating.stream().map(ratings->{ Product product=
//				restTemplate.getForObject("http://localhost:8082/products/1"+ ratings.getProductId(),Product.class);
//		return new ProductItem(product.getName(),400.7,"Black color",ratings.getRatings());}).collect(Collectors.toList());

		return rating.stream().map(ratings->{Product product=
				webClientBuilder.build().get()
				.uri("http://localhost:8082/products/1"+ ratings.getProductId())
				.retrieve()
				.bodyToMono(Product.class)
				.block();
		
		return new ProductItem(product.getName(),300,"White color", ratings.getRatings());		
			
		}).collect(Collectors.toList());

		
	}

}