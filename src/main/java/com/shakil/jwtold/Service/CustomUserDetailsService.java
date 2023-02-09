package com.shakil.jwtold.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.shakil.jwtold.model.CustomUserDetails;
import com.shakil.jwtold.model.User;
import com.shakil.jwtold.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = this.userRepository.findByUsername(username);
		
		if(user==null) {
			throw new UsernameNotFoundException("User not found!!");
		}else {
			return new CustomUserDetails(user);
		}
		
//		if(username.equals("Shakil"))
//		{
//			return new User("Shakil","Shakil123", new ArrayList<>());
//		}
//		else {
//			throw new UsernameNotFoundException("User not found !!");
//		}
	}
  
}
