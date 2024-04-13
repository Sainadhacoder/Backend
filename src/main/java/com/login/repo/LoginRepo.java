package com.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.entity.Login;

public interface LoginRepo extends JpaRepository<Login, String> {
	Login findByName(String name);

}
