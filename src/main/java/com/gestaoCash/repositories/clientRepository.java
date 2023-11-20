package com.gestaoCash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoCash.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}