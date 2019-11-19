package com.pyt.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pyt.auth.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
Optional<Users>  findByName(String username);
}
