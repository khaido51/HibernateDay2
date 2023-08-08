package com.coding.mentor.springrestapicodingmentor;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringRestApiCodingMentorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiCodingMentorApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
