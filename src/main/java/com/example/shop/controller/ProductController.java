package com.example.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shop.services.*;
import com.example.shop.entities.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/product")

public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		Product added = productService.addProduct(product);
		return ResponseEntity.ok(added);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<Product>> getProducts() {
		return ResponseEntity.ok(productService.getAllProducts());
	}
	
	@GetMapping("/get-by-id")
	public ResponseEntity<Optional<Product>> getProductById(@RequestParam long id) {
		Optional<Product> product = productService.getProduct(id);
		return ResponseEntity.ok(product);
	}
	
	@PostMapping("/delete")
	public ResponseEntity<String> deleteProduct(@RequestBody Product product) {
		productService.deleteProduct(product.getId());
		return ResponseEntity.ok("Deletion was successful!");
	}
	
	@PostMapping("/put")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		return ResponseEntity.ok(productService.updateProduct(product));
		
	}
 	
	

}
