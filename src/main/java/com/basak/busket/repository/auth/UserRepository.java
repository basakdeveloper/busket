package com.basak.busket.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basak.busket.model.auth.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

	User findOneByUsername(String username);
	
}
