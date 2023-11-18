package com.gestaoCash.services;

import java.util.List;
import com.gestaoCash.model.Users;

public interface UserService {
  void saveUser(Users user);

  List<Users> findAllUsers();

  Users findUserById(Long id);

  void updateUserById(Long id, Users updatedUser);

  void deleteUserById(Long id);
}
