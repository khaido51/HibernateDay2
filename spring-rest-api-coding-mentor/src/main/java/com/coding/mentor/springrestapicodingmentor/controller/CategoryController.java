package com.coding.mentor.springrestapicodingmentor.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coding.mentor.springrestapicodingmentor.dto.CategoryDTO;
import com.coding.mentor.springrestapicodingmentor.model.Category;
import com.coding.mentor.springrestapicodingmentor.model.Product;
import com.coding.mentor.springrestapicodingmentor.resository.CategoryRepository;
import com.coding.mentor.springrestapicodingmentor.resository.ProductRepository;

import jakarta.validation.Valid;

@RestController
@Validated
public class CategoryController {
	
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	ProductRepository productRepository;
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping("/categories")
	public List<Category> getAllCategories(){
		return categoryRepository.findAll();
	}

	
	@PostMapping("/categories")
	@Transactional
	public void addCategory(@RequestBody @Valid CategoryDTO categoryDTO ) {
		System.out.println("Category: xxx " + categoryDTO.getName());
		System.out.println("Products: yyy " + categoryDTO.getProducts().size());
		
		
		//add data to db
		//Mapping DTO to entity 
		Category category = modelMapper.map(categoryDTO, Category.class);
		//Save function only accept entity for return type
		//Hence, DTO need to be converted
		category = categoryRepository.save(category);
		//loop all new products and set the new category to them.
		List<Product> list = category.getProducts();
		for(Product product: list) {
			product.setCategory(category);
		}
		//Save list return type to product
		productRepository.saveAll(list);
		
	}
	
	
}
