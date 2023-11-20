package com.gestaoCash.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestaoCash.model.Users;
import com.gestaoCash.repositories.UserRepository;
import com.gestaoCash.services.UserService;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void saveUser(Users user) {
    this.userRepository.save(user);
  }

  @Override
  @Transactional(readOnly = true)
  public List<Users> findAllUsers() {
    return this.userRepository.findAll();
  }

  @Override
  @Transactional(readOnly = true)
  public Users findUserById(Long id) {
    var optionalUser = this.userRepository.findById(id);

    if (optionalUser.isPresent()) {
      var user = optionalUser.get();
      return user;
    } else {
      throw new EntityNotFoundException();
    }
  }

  @Override
  public void updateUserById(Long id, Users updatedUser) {
    this.userRepository.save(updatedUser);
  }

  @Override
  public void deleteUserById(Long id) {
    this.userRepository.deleteById(id);
  }

@Override
public Optional<Users> findByEmail(String email) {
	// TODO Auto-generated method stub
	return Optional.empty();
}

//@Override
//public Users findByUserEmail(String email) {
//	// TODO Auto-generated method stub
//	return userRepository.findByUserEmail(email);
//}

}
