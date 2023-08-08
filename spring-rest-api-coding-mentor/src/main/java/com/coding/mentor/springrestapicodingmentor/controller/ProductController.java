package com.coding.mentor.springrestapicodingmentor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coding.mentor.springrestapicodingmentor.model.Product;
import com.coding.mentor.springrestapicodingmentor.resository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	@PostMapping("/product")
	public void addProduct(@RequestBody Product product) {
		System.out.println(product.toString());
	}
	
	
	@GetMapping("/product")
	public void getIdAndName(@RequestParam int id, @RequestParam String name) {
		System.out.print(id + " - " + name);
	}
	
	@GetMapping("/products/{id}")
	public Product getIdFromPath(@PathVariable int id) {
		return productRepository.findById(id).get();
	}
	
	@PutMapping("/products/{id}")
	public Product updateProductDetails(@RequestBody Product product, @PathVariable int id) {
		
		Product updateProduct = productRepository.findById(id).orElseThrow();
		
		updateProduct.setName(product.getName());
		System.out.print("New Name: " + updateProduct);
		
		productRepository.save(updateProduct);
		
		return updateProduct;
	}
	
//	@GetMapping("/product")
//	public String getProductName() {
//		return "Test Product";
//	}
	
//	@GetMapping("/products")
//	public List<Product> getProducts() {
//		List<Product> list = new ArrayList<Product>();
//		list.add(new Product(1, "AA", 2));
//		list.add(new Product(2, "BB", 2));
//		list.add(new Product(3, "CC", 2));
//		
//		return list;
//	}
	
	
	
}
