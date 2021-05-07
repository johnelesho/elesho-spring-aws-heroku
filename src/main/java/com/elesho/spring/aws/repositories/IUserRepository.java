package com.elesho.spring.aws.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elesho.spring.aws.model.User;

public interface IUserRepository extends JpaRepository<User, Long>{

	Optional<User> findByUsername(String username);

}
