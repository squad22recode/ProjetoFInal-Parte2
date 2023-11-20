package com.gestaoCash.utils;

import org.springframework.security.core.context.SecurityContextHolder;

import com.gestaoCash.model.UserDetailsImpl;
import com.gestaoCash.model.Users;

public class DataUserAuth {

	public Users DataUser() {
		Users user = new Users();
		
		UserDetailsImpl dataUser = (UserDetailsImpl)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		user = dataUser.getDetailsLog();
		
		return user;
	}
}
