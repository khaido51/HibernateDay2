package com.coding.mentor.springrestapicodingmentor.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;


public class ProductDTO {
	
	@NotEmpty(message = "Name can not be null")
	@Size(min = 5, max = 20, message="The product name should be in a range from 5 -> 20")
	@Pattern(regexp = "^[a-zA-Z0-9 ]{6,12}$",  message = "product must be of 5 to 20 length with no special characters")
	private String name;
	
	@NotEmpty(message = "Title can not be null")
	private String title;
	
	@NotEmpty(message = "Author can not be null")
	private String author;
	
	@Min(value = 10, message = "The stock should not be lower than 10")
	@Max(value = 1000, message = "Tho stock should not be higher than 1000")
	private int stock;

	public ProductDTO() {

	}

	public ProductDTO(String name, String title, String author, int stock) {
		super();
		this.name = name;
		this.title = title;
		this.author = author;
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
