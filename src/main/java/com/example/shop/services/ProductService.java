package com.example.shop.services;

import com.example.shop.repository.ProductRepository; 
import com.example.shop.entities.Product;
import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	public void deleteProduct(long productId) {
		productRepository.deleteById(productId);
	}
	
	public Optional<Product> getProduct(long productId) {
		return productRepository.findById(productId);
	}
	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	
	public Product updateProduct(Product product) {
		Optional<Product> oldProductOpt = this.getProduct(product.getId());
		Product oldProduct = oldProductOpt.get();
		oldProduct.setName(product.getName());
		oldProduct.setDescription(product.getDescription());
		oldProduct.setPrice(product.getPrice());
		return productRepository.save(oldProduct);
	}
	
	
	
	
	
	
	
	

}
