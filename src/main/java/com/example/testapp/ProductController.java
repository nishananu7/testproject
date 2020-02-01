package com.example.testapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
@RequestMapping("/products")
	public String getProducts() {
	
	String productName="Two Seater Sofa";
		
		return "productName";
	}

}
