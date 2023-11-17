package com.gestaoCash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestaoCash.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

}
