package com.tms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tms.service.TmsService;

@Controller
public class AppController {
	
	@Autowired
	private TmsService service;

//	@Autowired
//	private TmsRepositoryDepartment deptrepo;
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	
	@GetMapping("/displayUsers")
	public String displayUsers(Model model) {
		model.addAttribute("ListUsers", service.getUsers());
		
		return "displayUsers";
	}
	
	@GetMapping("/displayDepartments")
	public String displayDepartments(Model model) {
		//List listDepartments = (List) deptrepo.findAll();
		model.addAttribute("ListDepartments",service.getDepartments());
		
		return "displayDepartments";
	}
	
}

