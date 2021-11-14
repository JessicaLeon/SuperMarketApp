package com.demo.backendservice.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.backendservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
