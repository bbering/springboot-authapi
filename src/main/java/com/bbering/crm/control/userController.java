package com.bbering.crm.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bbering.crm.model.User;
import com.bbering.crm.repository.UserRepository;

@RestController
@RequestMapping("/users") // endpoint
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
}