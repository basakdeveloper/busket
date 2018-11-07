package com.basak.homemaker.user.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.basak.homemaker.user.model.User;

public interface UserRepository extends CrudRepository<User, Serializable> {

	User findByUsername(String username);
	
}
