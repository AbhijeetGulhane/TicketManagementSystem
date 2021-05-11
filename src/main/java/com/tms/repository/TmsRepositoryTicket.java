package com.tms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.entity.Ticket;

public interface TmsRepositoryTicket extends JpaRepository<Ticket, Integer> {

	List<Ticket> findAll();
	
	//Ticket findByName(String name);

}