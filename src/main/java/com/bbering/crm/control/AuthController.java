package com.bbering.crm.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbering.crm.model.AuthenticationDTO;

@RestController
@RequestMapping("/auth")
public class AuthController {

  @Autowired
  private AuthenticationManager authManager;

  @PostMapping("/login")
  public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data) {
    var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
    var auth = this.authManager.authenticate(usernamePassword);

    return ResponseEntity.ok().build();
  }
}
