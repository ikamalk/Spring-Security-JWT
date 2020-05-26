package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

	   @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		   if(username.equals("username"))
	        return new User("username", "{noop}password",
	                new ArrayList<>());
		   return null;
	    }
}
