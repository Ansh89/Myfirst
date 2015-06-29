package com.aartek.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.LoginModel;

 
@Repository
public class LoginRepository {
@Autowired
HibernateTemplate ht;
	public void save(LoginModel login1) {
		// TODO Auto-generated method stub
		System.out.println(login1.getPassword());
		login1.getLoginId();
		ht.save(login1);
		
}}