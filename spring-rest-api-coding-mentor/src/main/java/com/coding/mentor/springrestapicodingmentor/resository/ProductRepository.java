package com.coding.mentor.springrestapicodingmentor.resository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.coding.mentor.springrestapicodingmentor.model.Product;


@Repository
@EnableJpaRepositories(basePackages = "com.coding.mentor.springrestapicodingmentor.repository")
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
