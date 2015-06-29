package com.aartek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aartek.model.LoginModel;
 
@Component
public class LoginValidator implements Validator

{

	public boolean supports(Class<?> clazz)
	{
		return LoginModel.class.isAssignableFrom(clazz);
		 
		 
	}

	public void validate(Object login1, Errors result)
	{
		LoginModel login=(LoginModel)login1;
		ValidationUtils.rejectIfEmpty(result, "username", "error.name.empty");
		ValidationUtils.rejectIfEmpty(result, "password", "error.password.empty");
		
		
		
	}

}
