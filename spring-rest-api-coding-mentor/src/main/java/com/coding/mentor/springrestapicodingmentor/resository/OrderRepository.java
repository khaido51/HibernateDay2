package com.coding.mentor.springrestapicodingmentor.resository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.coding.mentor.springrestapicodingmentor.model.Account;
import com.coding.mentor.springrestapicodingmentor.model.Order;

@Repository
public class OrderRepository {
	
	public List<Order> getOrdersByUser(Account account){
		
		return null; 
	}
}
