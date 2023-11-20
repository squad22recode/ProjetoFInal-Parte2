package com.gestaoCash.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gestaoCash.enums.StateEnum;
import com.gestaoCash.model.Revenue;
import com.gestaoCash.model.Users;
import com.gestaoCash.repositories.RevenueRepository;
import com.gestaoCash.repositories.UserRepository;
import com.gestaoCash.services.UserService;
import com.gestaoCash.utils.SenhaUtils;

@Controller
@RequestMapping("/usuario")
public class UsersController {

	@Autowired
	private UserService userService;
	

	@GetMapping("/cadastro")
	public String cadastrar(Model model) {
		model.addAttribute("states", StateEnum.values());

		model.addAttribute("user", new Users());

		return "usuario/cadastro";

	}
	
	@PostMapping("/cadastro")
	public ModelAndView cadastrar(Model model, @ModelAttribute("user") Users user, 
			@RequestParam("inputImg") MultipartFile file,BindingResult result)
			throws IOException{
		
		try {
			user.setImagemPerfil(file.getBytes());
			} catch (IOException e) {
			e.printStackTrace();
		}
		
		 //Users existingUser = userService.findByUserEmail(user.getEmail());

//	        if(existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()){
//	            result.rejectValue("email", null,
//	                    "There is already an account registered with the same email");
//	        }
	        
	        if(result.hasErrors()){
	            model.addAttribute("user", user);
	            ModelAndView modelAndView = new ModelAndView("/cadastro");
	            return modelAndView;
	        }
		
		
		String senhaEncriptada = SenhaUtils.encode(user.getSenha());
		user.setSenha(senhaEncriptada);
		user.setTipoUsuario("user");
		userService.saveUser(user);
		ModelAndView modelAndView = new ModelAndView("redirect:/");
				return modelAndView;
		
		
		
	}
		

	@GetMapping("/area-cliente")
	public ModelAndView areaDoCliente(Users user, Revenue revenue) {
		ModelAndView modelAndView = new ModelAndView("usuario/area-do-cliente");
		return modelAndView;
	}
	
	@Autowired
	private RevenueRepository rRepository;
	
	@PostMapping("/area-cliente")
	public ModelAndView areaDoCliente(@ModelAttribute("revenue") Revenue revenue) {
		
		Users user = new Users();
		
		user.setId(Long.valueOf(1));
		revenue.setUsuario(user);
		
		rRepository.save(revenue);
		
		ModelAndView modelAndView = new ModelAndView("redirect:area-do-cliente");
		return modelAndView;
	}

}
