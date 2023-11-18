package com.gestaoCash.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gestaoCash.enums.StateEnum;

import com.gestaoCash.model.Users;
import com.gestaoCash.services.UserService;

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
	public ModelAndView cadastrar(@ModelAttribute("user") Users user, @RequestParam("inputImg") MultipartFile file)
			throws IOException {
		try {
			user.setImagemPerfil(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(user);
		user.setTipoUsuario("user");
		userService.saveUser(user);

		ModelAndView modelAndView = new ModelAndView("redirect:/");

		return modelAndView;

	}

	@GetMapping("/entrar")
	public ModelAndView entrar(Users user) {
		ModelAndView modelAndView = new ModelAndView("usuario/entrar");
		return modelAndView;
	}

	@GetMapping("/area-cliente")
	public ModelAndView areaDoCliente(Users user) {
		ModelAndView modelAndView = new ModelAndView("usuario/area-do-cliente");
		return modelAndView;
	}

}
