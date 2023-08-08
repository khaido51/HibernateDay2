package com.coding.mentor.springrestapicodingmentor.service;

import org.springframework.stereotype.Service;

import com.coding.mentor.springrestapicodingmentor.model.Account;
import com.coding.mentor.springrestapicodingmentor.resository.UserRepository;


//Service class contains complex business logic and functions only
@Service
public class LoginService {
	UserRepository userRepository = new UserRepository();
	
	public boolean checkLogin(Account account) {
		
		//logic 1
		account = userRepository.getAccount(account);
		if(account != null) {
			return true;
		}
		
		return false;
	}
}
