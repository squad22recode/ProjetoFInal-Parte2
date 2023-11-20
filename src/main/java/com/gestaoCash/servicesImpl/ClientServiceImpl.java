package com.gestaoCash.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestaoCash.model.Client;
import com.gestaoCash.repositories.ClientRepository;
import com.gestaoCash.services.ClientService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClientServiceImpl implements ClientService {

  @Autowired
  private ClientRepository clientRepository;

  @Override
  public void saveClient(Client client) {
    this.clientRepository.save(client);
  }

  @Override
  @Transactional(readOnly = true)
  public List<Client> findAllClient() {
    var clients = this.clientRepository.findAll();

    return clients;
  }

  @Override
  @Transactional(readOnly = true)
  public Client findClientById(Long id) {
    var optionalClient = this.clientRepository.findById(id);

    if (optionalClient.isPresent()) {
      var client = optionalClient.get();
      return client;
    } else {
      throw new EntityNotFoundException();
    }

  }

  @Override
  public void updateClientById(Long id, Client uptatedClient) {
    // var client = this.clientRepository.findById(id).orElse(null);

    // if (client != null) {

    // }
    this.clientRepository.save(uptatedClient);
  }

  @Override
  public void deleteClientById(Long id) {
    this.clientRepository.deleteById(id);
  }

  @Override
  public void deleteAllClientsById(List<Long> ids) {
    this.clientRepository.deleteAllById(ids);
  }

}
