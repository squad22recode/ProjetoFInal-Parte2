package com.gestaoCash.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gestaoCash.model.UserDetailsImpl;
import com.gestaoCash.model.Users;
import com.gestaoCash.repositories.UserRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	  @Autowired
	    private UserRepository usersRepository;

	    @Override
	    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	       Users user = usersRepository.findByEmail(email)
	            .orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));

	        return new UserDetailsImpl(user);
	    } 
}
