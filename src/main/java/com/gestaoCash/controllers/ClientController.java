package com.gestaoCash.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gestaoCash.enums.StateEnum;
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
    model.addAttribute("novoCliente", new Client());
    model.addAttribute("states", StateEnum.values());

    return "cliente/listar";
  }

  // @GetMapping("/novo")
  // public String showForm(Model model) {
  // Client client = new Client();
  // model.addAttribute("cliente", client);
  // return "cliente/formulario";
  // }

  @PostMapping("/cadastro")
  public String saveClient(@ModelAttribute("novoCliente") Client client) {
    this.clientService.saveClient(client);

    return "redirect:/clientes";
  }

  @GetMapping("/editar/{id}")
  public String showEditForm(@PathVariable Long id, Model model) {
    var client = this.clientService.findClientById(id);
    model.addAttribute("editarCliente", client);

    return "cliente/editar";
  }

  @PostMapping("/editar/{id}")
  public String updateClient(@ModelAttribute("editarCliente") Client updatedClient, @PathVariable Long id) {
    this.clientService.updateClientById(id, updatedClient);

    return "redirect:/clientes";
  }

  @GetMapping("/excluir/{id}")
  public String deleteClient(@PathVariable Long id) {
    this.clientService.deleteClientById(id);

    return "redirect:/clientes";
  }

  // excluir varios
  @GetMapping("/excluir")
  public String deleteClient(@RequestParam("ids") List<Long> ids) {
    var idsNonNull = ids.stream().filter(id -> id != null).toList();
    this.clientService.deleteAllClientsById(idsNonNull);

    return "redirect:/clientes";
  }
}
