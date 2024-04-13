package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.Login;
import com.login.service.LoginService;
@CrossOrigin("*")
@RestController
public class LoginController {
	@Autowired
	LoginService lgService;
	
	@PostMapping("loginUser/user/add")
	public Login addNewUser(@RequestBody Login lg) {
		return lgService.addNewUserAcc(lg);
	}
	
	@GetMapping("/loginUser")
	public String checkLogin(@RequestParam String name,String password) {
		return lgService.checkIsValidUser(name,password);
	}
}
