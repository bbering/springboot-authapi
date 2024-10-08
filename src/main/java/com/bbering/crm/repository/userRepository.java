package com.bbering.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.bbering.crm.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  UserDetails findByLogin(String login);
}