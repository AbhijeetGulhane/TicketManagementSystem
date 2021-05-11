package com.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tms.entity.Department;
import com.tms.entity.Ticket;
import com.tms.entity.User;
import com.tms.service.TmsService;

@RestController
public class TmsController{
	
	@Autowired
	private TmsService service;
	
//    @RequestMapping("/")
//    @ResponseBody
//    public String welcome() {
//        return "Welcome to Ticket Management System.";
//    }
	
	@GetMapping("/getAllUsers")
    public List<User> findAllUsers() {
        return service.getUsers(); //getUsers()
    }

    @GetMapping("/getAllTickets")
    public List<Ticket> findAllTickets() {
        return service.getTickets();
    }	

	@GetMapping("/getAllDepartments")
    public List<Department> findAll() {
        return service.getDepartments();
    }
	
    @GetMapping("/getUserById/{id}")
    public User findUserById(@PathVariable int id) {
        return service.getUserById(id);
    }

    
    @GetMapping("/getDepartmentById/{id}")
    public Department findDepartmentById(@PathVariable int id) {
        return service.getDepartmentById(id);
    }

    
    @GetMapping("/getTicketById/{id}")
    public Ticket findTicketById(@PathVariable int id) {
        return service.getTicketById(id);
    }

    
    @PostMapping("/addUser")
    public User addProduct(@RequestBody User user) {
        return service.saveUser(user);
    }

    @PostMapping("/addDepartment")
    public Department addDepartment(@RequestBody Department department) {
        return service.saveDepartment(department);
    }

    @PostMapping("/addTicket")
    public Ticket addTicket(@RequestBody Ticket ticket) {
        return service.saveTicket(ticket);
    }


    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.deleteUser(id);
    }

    @DeleteMapping("/deleteDepartment/{id}")
    public String deleteDepartment(@PathVariable int id) {
        return service.deleteDepartment(id);
    }

    @DeleteMapping("/deleteTicket/{id}")
    public String deleteTicket(@PathVariable int id) {
        return service.deleteTicket(id);
    }

}