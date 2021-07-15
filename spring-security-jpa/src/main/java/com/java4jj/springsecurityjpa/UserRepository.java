package com.java4jj.springsecurityjpa;


import org.springframework.data.jpa.repository.JpaRepository;

import com.java4jj.springsecurityjpa.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String userName);
}
