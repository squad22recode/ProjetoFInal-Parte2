package com.gestaoCash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestaoCash.model.client.Client;

public interface clientRepository extends JpaRepository<Client, Long> {

}
