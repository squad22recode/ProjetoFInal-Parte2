package com.gestaoCash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestaoCash.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
