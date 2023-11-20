package com.gestaoCash.controllers;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gestaoCash.model.Users;
import com.gestaoCash.repositories.UserRepository;
import com.gestaoCash.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AuthenticationController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/login")
	public ModelAndView entrar(Users user) {
		ModelAndView modelAndView = new ModelAndView("usuario/entrar");
		return modelAndView;
	}

	    
//	    @GetMapping("/perfil")
//	    public ModelAndView perfil(Principal principal) {
//	        ModelAndView modelAndView = new ModelAndView("usuario/perfil");
//
//	        UserDetails user = userRepo.findByEmail(principal.getName());
//	        modelAndView.addObject("usuario", user);
//	   
//
//	        return modelAndView;
//	    }
	
//	@PostMapping("/login")
//	public void login(@RequestBody @Valid ) {
//		
//		
//		
//	}
}


//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class AuthenticateController implements WebMvcConfigurer {
//
//	public void addViewControllers(ViewControllerRegistry registry) {
//		
//		registry.addViewController("/login").setViewName("usuario/entrar");
//	}
//
//}