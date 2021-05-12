package com.tms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.entity.User;


public interface TmsRepositoryUser extends JpaRepository<User, Integer> {

//	List<User> findAllUsers();
}








