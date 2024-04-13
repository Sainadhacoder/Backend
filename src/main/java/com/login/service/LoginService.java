package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.entity.Login;
import com.login.repo.LoginRepo;

@Service
public class LoginService {
	@Autowired
	LoginRepo lgRepo;
	
	public Login addNewUserAcc(Login lg) {
		// TODO Auto-generated method stub
		return lgRepo.save(lg);
	}

	public String checkIsValidUser(String name, String password) {
		Login lgUser=lgRepo.findByName(name);
		
		if((lgUser != null) && (lgUser.getPassword().contentEquals(password) == true)) {
			return "success";
		}
		return "failure";
	}

	

	
	
	

}
