package com.gestaoCash.repositories;

import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoCash.model.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	 Optional<Users> findByEmail(String email);
	 
}
