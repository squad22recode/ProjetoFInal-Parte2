package com.gestaoCash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestaoCash.model.Client;
import com.gestaoCash.services.ClientService;

@Controller
@RequestMapping("/clientes")
public class ClientController {

  @Autowired
  private ClientService clientService;

  @GetMapping
  public String listAllClient(Model model) {
    var clients = this.clientService.findAllClient();
    model.addAttribute("clientes", clients);

    // criar a view para listar e colocar o nome da view/html no retorno
    return "";
  }

  @GetMapping("/novo")
  public String showForm(Model model) {
    Client client = new Client();
    model.addAttribute("cliente", client);

    // criar o form para add cliente
    return "";
  }

  @PostMapping("/save")
  public String saveClient(@ModelAttribute("cliente") Client client) {
    this.clientService.saveClient(client);

    return "redirect:/clientes";
  }

  @GetMapping("/editar/{id}")
  public String showEditForm(@PathVariable Long id, Model model) {
    var client = this.clientService.findClientById(id);
    model.addAttribute("cliente", client);

    // criar o html form que mostra os dados atuais
    return "";
  }

  @PostMapping("/editar/{id}")
  public String updateClient(@ModelAttribute("cliente") Client updatedClient, @PathVariable Long id) {
    this.clientService.updateClientById(id, updatedClient);

    return "redirect:/clientes";
  }

  @GetMapping("/excluir/{id}")
  public String deleteClient(@PathVariable Long id) {
    this.clientService.deleteClientById(id);

    return "redirect:/clientes";
  }
}
