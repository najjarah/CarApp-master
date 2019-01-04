package com.example.carApp.domain;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

	/*  @Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1",       nativeQuery = true)
	  User findByEmailAddress(String emailAddress);
*/	}