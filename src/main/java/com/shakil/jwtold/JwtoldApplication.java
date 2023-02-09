package com.shakil.jwtold;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shakil.jwtold.model.User;
import com.shakil.jwtold.repository.UserRepository;

@SpringBootApplication
public class JwtoldApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	Random random = new Random();
	
	public void createUsers() {
		User user = new User();
		Long id = new Long(random.nextInt(1000));
		user.setId(id);
		user.setUsername("user" + id);
		user.setPassword("user" + id);
		user.setEmail("user"+id+"@gmail.com");
		user.setEnabled(true);
		user.setRole("Admin");
		
		User savedUser = userRepository.save(user);
		
		System.out.println(savedUser);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JwtoldApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		createUsers();
	}

}
