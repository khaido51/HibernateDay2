package com.coding.mentor.springrestapicodingmentor.resository;


import org.springframework.stereotype.Repository;
import com.coding.mentor.springrestapicodingmentor.model.Account;


//Repository is only used to go into database to get data
@Repository
public class UserRepository {
	
	public Account getAccount(Account account) {
		//check if user.password + user.name exist in database
		
		
		return account;
		
	}
}
