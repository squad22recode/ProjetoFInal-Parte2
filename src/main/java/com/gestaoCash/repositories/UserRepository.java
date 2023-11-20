package com.gestaoCash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoCash.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}
