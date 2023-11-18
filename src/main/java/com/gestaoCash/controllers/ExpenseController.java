// package com.gestaoCash.controllers;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// import com.gestaoCash.model.Expense;
// import com.gestaoCash.services.ExpenseService;

// @Controller
// @RequestMapping("/teste")
// public class ExpenseController {

// @Autowired
// private ExpenseService expenseService;

// @GetMapping
// public String listAll() {
// var expenses = this.expenseService.findAllExpense();

// return "";
// }

// @GetMapping("")
// public String showForm(Model model) {
// model.addAttribute("expense", new Expense());

// return "";
// }

// @PostMapping("")
// public String saveExpense(@ModelAttribute("expense") Expense expense) {
// this.saveExpense(expense);

// return "redirect:/";
// }

// @GetMapping("")
// public String deleteExpense(@PathVariable Long id) {
// this.deleteExpense(id);

// return "redirect:/";
// }
// }
