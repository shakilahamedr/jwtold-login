package com.shakil.jwtold.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shakil.jwtold.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	  public User findByUsername(String username); 
}
