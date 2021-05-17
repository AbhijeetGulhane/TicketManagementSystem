package com.tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tms.entity.Department;
import com.tms.entity.Ticket;
import com.tms.entity.User;
import com.tms.repository.TmsRepositoryDepartment;
import com.tms.repository.TmsRepositoryTicket;
import com.tms.repository.TmsRepositoryUser;
import com.tms.service.TmsService;

@Controller
public class AppController {
	
	@Autowired
	private TmsService service;
	
	@Autowired
	private TmsRepositoryTicket ticketRepository;
	@Autowired
	private TmsRepositoryUser userRepository;
	@Autowired
	private TmsRepositoryDepartment departmentRepository;

//	@Autowired
//	private TmsRepositoryDepartment deptrepo;
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/displayDepartments")
	public String displayDepartments(Model model) {
		//List listDepartments = (List) deptrepo.findAll();
		model.addAttribute("ListDepartments",service.getDepartments());
		return "displayDepartments";
	}
	
	@GetMapping("/createDepartment")
	public String showDepartmentNewForm(Model model) {
		model.addAttribute("ListDepartments",service.getDepartments());
		model.addAttribute("createDepartment", new Department());
		model.addAttribute("department", new Department());
		return "newdepartment_form";
	}

	@PostMapping("/saveDepartment")
	public String saveDepartment(Department department) {
		departmentRepository.save(department);
		return "redirect:/displayDepartments";
	}

	@GetMapping("/editDepartment/{id}")
	public String editDepartmentForm(@PathVariable("id") Integer id, Model model) {
		model.addAttribute("ListDepartments",service.getDepartments());
		Department department = departmentRepository.findById(id).get();
		model.addAttribute("department", department);
		return "newdepartment_form";
	}

	@GetMapping("/deleteDepartment/{id}")
	public String deleteDepartmentForm(@PathVariable("id") Integer id, Model model) {
		departmentRepository.deleteById(id);
		return "redirect:/displayDepartments";
	}

	@GetMapping("/displayTickets")
	public String displayTickets(Model model) {
		//List listDepartments = (List) deptrepo.findAll();
		model.addAttribute("ListTickets",service.getTickets());
		return "displayTickets";
	}

	@GetMapping("/createTicket")
	public String showTicketNewForm(Model model) {
		//List<User> listUsers = userRepository.findAll();
		//model.addAttribute("ListUsers", new User());
		model.addAttribute("ListUsers", service.getUsers());
		model.addAttribute("createTicket", new Ticket());
		model.addAttribute("ticket", new Ticket());
		return "newticket_form";
	}

	@PostMapping("/saveTicket")
	public String saveTicket(Ticket ticket) {
		ticketRepository.save(ticket);
		return "redirect:/displayTickets";
	}

	@GetMapping("/editTicket/{id}")
	public String editTicketForm(@PathVariable("id") Integer id, Model model) {
		Ticket ticket = ticketRepository.findById(id).get();
		model.addAttribute("ListUsers", service.getUsers());
		model.addAttribute("ticket", ticket);
		model.addAttribute("user", new User());		
		return "newticket_form";
	}

	@GetMapping("/deleteTicket/{id}")
	public String deleteTicketForm(@PathVariable("id") Integer id, Model model) {
		ticketRepository.deleteById(id);
		return "redirect:/displayTickets";
	}

	
	
	
	@GetMapping("/displayUsers")
	public String displayUsers(Model model) {
		model.addAttribute("ListUsers", service.getUsers());
		return "displayUsers";
	}

	@GetMapping("/createUser")
	public String showUserNewForm(Model model) {
		//List<User> listUsers = userRepository.findAll();
		//model.addAttribute("ListUsers", new User());
		model.addAttribute("ListDepartments", service.getDepartments());
		model.addAttribute("createUser", new User());		
		model.addAttribute("user", new User());
		return "newuser_form";
	}

	@PostMapping("/saveUser")
	public String saveUser(User user) {
		userRepository.save(user);
		return "redirect:/displayUsers";
	}

	@GetMapping("/editUsers/{id}")
	public String editUserForm(@PathVariable("id") Integer id, Model model) {
		User user = userRepository.findById(id).get();
		//System.out.println(user.getUid());
		model.addAttribute("ListDepartments", service.getDepartments());
		model.addAttribute("user", user);
		return "newuser_form";
	}

	@GetMapping("/deleteUser/{id}")
	public String deleteUserForm(@PathVariable("id") Integer id, Model model) {
		
		userRepository.deleteById(id);
		return "redirect:/displayUsers";
	}
		
}
