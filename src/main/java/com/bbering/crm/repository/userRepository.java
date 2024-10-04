package com.bbering.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bbering.crm.model.User;

public interface userRepository extends JpaRepository<User, Long> {

}