package com.gestaoCash.services;

import java.util.List;

import com.gestaoCash.model.Client;

public interface ClientService {
  void saveClient(Client client);

  List<Client> findAllClient();

  Client findClientById(Long id);

  void updateClientById(Long id, Client updatedClient);

  void deleteClientById(Long id);

  void deleteAllClientsById(List<Long> ids);
}
