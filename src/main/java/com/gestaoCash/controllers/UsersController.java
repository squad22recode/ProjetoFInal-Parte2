package com.gestaoCash.controllers;

import java.awt.Image;
import java.io.IOException;
import java.nio.file.attribute.UserPrincipal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.ImageIcon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.security.authentication.TestingAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gestaoCash.enums.StateEnum;
import com.gestaoCash.model.Expense;
import com.gestaoCash.model.Revenue;
import com.gestaoCash.model.UserDetailsImpl;
import com.gestaoCash.model.Users;
import com.gestaoCash.repositories.UserRepository;
import com.gestaoCash.services.ExpenseService;
import com.gestaoCash.services.RevenueService;
import com.gestaoCash.services.UserService;
import com.gestaoCash.utils.SenhaUtils;

@Controller
@RequestMapping("/usuario")
public class UsersController {

	@Autowired
	private UserService userService;

	@Autowired
	private ExpenseService expenseService;

	@Autowired
	private RevenueService revenueService;
	private Authentication auth;
	
	@GetMapping("/cadastro")
	public String cadastrar(Model model) {
		model.addAttribute("states", StateEnum.values());
		model.addAttribute("user", new Users());

		return "usuario/cadastro";

	}

	@PostMapping("/cadastro")
	public ModelAndView cadastrar(Model model, @ModelAttribute("user") Users user,
			@RequestParam("inputImg") MultipartFile file, BindingResult result)
			throws IOException {

		try {
			user.setImagemPerfil(file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Users existingUser = userService.findByUserEmail(user.getEmail());

		// if(existingUser != null && existingUser.getEmail() != null &&
		// !existingUser.getEmail().isEmpty()){
		// result.rejectValue("email", null,
		// "There is already an account registered with the same email");
		// }

		if (result.hasErrors()) {
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
	public ModelAndView areaDoCliente(Model model, Users user, Revenue revenue,@ModelAttribute("user") Users editUser) {
		ModelAndView modelAndView = new ModelAndView("usuario/area-do-cliente");
		modelAndView.addObject("expense", new Expense());
		modelAndView.addObject("revenue", new Revenue());	
		
		UserDetailsImpl dateUser = (UserDetailsImpl)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		Users getUser = dateUser.getDetailsLog();
		//String img = getUser.getImagemPerfil() + ":image/png;base64," + conver;
		
		model.addAttribute("getUser", getUser );
		Image img = new ImageIcon(getUser.getImagemPerfil()).getImage();
		model.addAttribute("img", img);
		return modelAndView;
	}

	@PostMapping("/area-cliente")
	public ModelAndView areaDoCliente(@ModelAttribute("revenue") Revenue revenue,
			@ModelAttribute("expense") Expense expense) {

		Users user = new Users();
		
		//pegando os dados do usuário logado
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		UserDetailsImpl dateUser = (UserDetailsImpl) auth.getPrincipal();
		
		//pegando o id
		Long id = dateUser.getDetailsLog().getId();
		//setando o id no usuario
		user.setId(id);
		
		//salvando no banco de dados
		revenue.setUsuario(user);
		expense.setUsuario(user);

		revenueService.saveRevenue(revenue);
		expenseService.saveExpense(expense);

		ModelAndView modelAndView = new ModelAndView("redirect:area-do-cliente");
		return modelAndView;
	}

//	@PostMapping("/area-cliente/despesa")
//	public String addExpense() {
//		this.expenseService.saveExpense(expense);
//
//		return "redirect:/usuario/area-cliente";
//	}
}
