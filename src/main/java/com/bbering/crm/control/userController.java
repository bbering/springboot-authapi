package com.bbering.crm.control;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bbering.crm.model.User;
import com.bbering.crm.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public User putUser(@RequestBody User user) {
    return userRepository.save(user);
  }

  @DeleteMapping
  public ResponseEntity<Void> removeUser(@RequestBody User user) {
    Optional<User> userToDelete = userRepository.findById(user.getId());
    if (userToDelete.isPresent()) {
      userRepository.delete(userToDelete.get());
      return ResponseEntity.noContent().build(); // retorna 204 no Content se for possivel deletar
    } else {
      return ResponseEntity.notFound().build(); // retorna 404 not found se nao encontrar o usuario
    }
  }
}