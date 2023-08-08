package com.coding.mentor.springrestapicodingmentor.resository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coding.mentor.springrestapicodingmentor.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
