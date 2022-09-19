package com.ty.basic.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.basic.authentication.dto.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findUserByUsername(String username);
}
