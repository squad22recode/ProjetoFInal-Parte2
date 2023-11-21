package com.gestaoCash.controllers;

import java.awt.Image;
import java.io.IOException;
import java.nio.file.attribute.UserPrincipal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import javax.swing.ImageIcon;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.support.Repositories;
import org.springframework.format.annotation.DateTimeFormat;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.gestaoCash.enums.StateEnum;
import com.gestaoCash.model.Address;
import com.gestaoCash.model.Expense;
import com.gestaoCash.model.Revenue;
import com.gestaoCash.model.UserDetailsImpl;
import com.gestaoCash.model.Users;
import com.gestaoCash.repositories.ExpenseRespository;
import com.gestaoCash.repositories.RevenueRepository;
import com.gestaoCash.repositories.UserRepository;
import com.gestaoCash.services.ExpenseService;
import com.gestaoCash.services.RevenueService;
import com.gestaoCash.services.UserService;
import com.gestaoCash.utils.DataUserAuth;
import com.gestaoCash.utils.SenhaUtils;

@Controller
@RequestMapping("/usuario")
public class UsersController {

	@Autowired
	private UserService userService;

	@Autowired
	UserRepository userepo;
	
	@Autowired
	ExpenseRespository expRepo;
	
	@Autowired
	private RevenueRepository revRepo;

	@Autowired
	private ExpenseService expenseService;

	@Autowired
	private RevenueService revenueService;

	DataUserAuth data = new DataUserAuth();

	@GetMapping("/cadastro")
	public String cadastrar(Model model) {
		model.addAttribute("states", StateEnum.values());
		model.addAttribute("user", new Users());

		return "usuario/cadastro";

	}

	@GetMapping("/editar")
	public String editUserView(Model model) {
		Users user = new Users();
		user = data.DataUser();
		model.addAttribute("getUser", user);
		model.addAttribute("user", user);
		model.addAttribute("states", StateEnum.values());
		return "/usuario/editar";
	}

	@PostMapping("/cadastro")
	public ModelAndView cadastrar(Model model, @ModelAttribute("user") Users user,
			@RequestParam("inputImg") MultipartFile file, BindingResult result) throws IOException {

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

	@GetMapping("/imagem/{id}")
	@ResponseBody
	public byte[] exibirImagen() {
		Long id = data.DataUser().getId();
		Users user = this.userepo.getReferenceById(id);
		return user.getImagemPerfil();
	}

	@GetMapping("/area-cliente")
	public ModelAndView areaDoCliente(Model model, Users user, Revenue revenue) {
		ModelAndView modelAndView = new ModelAndView("usuario/area-do-cliente");
		modelAndView.addObject("expense", new Expense());
		modelAndView.addObject("revenue", new Revenue());
		
		Users getUser = data.DataUser();

		// String img = getUser.getImagemPerfil() + ":image/png;base64," + conver;
		Long id = getUser.getId();
		modelAndView.addObject("user", userService.findUserById(id));
		model.addAttribute("getUser", getUser);
		Image img = new ImageIcon(getUser.getImagemPerfil()).getImage();
		model.addAttribute("img", img);
		
		//List<Revenue> revenues = revRepo.findRevenueByUser(data.DataUser().getId()); 
	
		List<Revenue> revenues = revRepo.findAll();		
				
		List<Expense> exps = expRepo.findAll();
		
		model.addAttribute("exps",exps);
		model.addAttribute("revs", revenues);
;		return modelAndView;
	}

	@PostMapping("/area-cliente")
	public String addRevenue(@ModelAttribute("revenue") Revenue revenue) {

		Users user = new Users();

		// pegando os dados do usuário logado
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		UserDetailsImpl dateUser = (UserDetailsImpl) auth.getPrincipal();

		// pegando o id
		Long id = data.DataUser().getId();
		// setando o id no usuario
		user.setId(id);

		// salvando no banco de dados
		revenue.setUsuario(user);
		revenueService.saveRevenue(revenue);

//		ModelAndView modelAndView = new ModelAndView("redirect:/area-do-cliente");
//		
		return "redirect:/usuario/area-cliente";
	}

	@PostMapping("/area-cliente/despesa")
	public String addExpense(@ModelAttribute("expense") Expense expense) {

		Users user = new Users();
		Long id = data.DataUser().getId();
		user.setId(id);

		expense.setUsuario(user);

		this.expenseService.saveExpense(expense);

		return "redirect:/usuario/area-cliente";
	}

	@PostMapping("/editar")
	public String editUser(@ModelAttribute("user") Users editUser, @RequestParam("inputImg") MultipartFile file,
			BindingResult result) throws IOException {

		try {
			if (file != null) {
				editUser.setImagemPerfil(file.getBytes());
			} else {

				editUser.setImagemPerfil(data.DataUser().getImagemPerfil());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String password = data.DataUser().getSenha();
		Long id = data.DataUser().getId();
		String typeUser = data.DataUser().getTipoUsuario();
		editUser.setId(id);
		editUser.setSenha(password);
		Address address = new Address();
		address = data.DataUser().getEnderecoUsuario();
		editUser.setTipoUsuario(typeUser);
		editUser.setEnderecoUsuario(address);
		userepo.saveAndFlush(editUser);
		return "redirect:/usuario/area-cliente";
	}
}
