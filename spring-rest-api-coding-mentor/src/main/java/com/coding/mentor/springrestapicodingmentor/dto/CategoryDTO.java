package com.coding.mentor.springrestapicodingmentor.dto;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CategoryDTO {
	@NotEmpty(message = "Category can not be null")
	@Size(min = 5, max = 20, message="The Category name should be in a range from 5 -> 20")
	@Pattern(regexp = "^[a-zA-Z0-9 ]{6,12}$",  message = "Category name must be of 5 to 20 length with no special characters")
	String name;
	
	@Valid
	List<ProductDTO> products;

	public CategoryDTO() {

	}

	
	
	public CategoryDTO(String name, List<ProductDTO> products) {
		super();
		this.name = name;
		this.products = products;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}

	

}
