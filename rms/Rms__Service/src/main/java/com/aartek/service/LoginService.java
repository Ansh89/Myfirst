package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.LoginModel;
import com.aartek.repository.LoginRepository;

	@Service
	public class LoginService {
 
    @Autowired
    LoginRepository loginRepository;

	public void validateservice(LoginModel login1) {
		// TODO Auto-generated method stub
		System.out.println(login1.getPassword());
		loginRepository.save(login1);
	}
    
		
}
