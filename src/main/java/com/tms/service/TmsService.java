package com.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tms.entity.Department;
import com.tms.entity.Ticket;
import com.tms.entity.User;
import com.tms.repository.TmsRepositoryDepartment;
import com.tms.repository.TmsRepositoryTicket;
import com.tms.repository.TmsRepositoryUser;

@Service
public class TmsService {
	@Autowired
	private TmsRepositoryTicket ticketRepository;
	@Autowired
	private TmsRepositoryUser userRepository;
	@Autowired
	private TmsRepositoryDepartment departmentRepository;
	
	
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public List<Ticket> getTickets() {
        return ticketRepository.findAll();
    }
	
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id).orElse(null);
    }

    public Ticket getTicketById(int id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
	
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
	
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
	
    public String deleteUser(int id) {
    	userRepository.deleteById(id);
        return "User removed !! " + id;
    }

    public String deleteDepartment(int id) {
    	departmentRepository.deleteById(id);
        return "Department removed !! " + id;
    }

    public String deleteTicket(int id) {
    	ticketRepository.deleteById(id);
        return "Ticket removed !! " + id;
    }


}