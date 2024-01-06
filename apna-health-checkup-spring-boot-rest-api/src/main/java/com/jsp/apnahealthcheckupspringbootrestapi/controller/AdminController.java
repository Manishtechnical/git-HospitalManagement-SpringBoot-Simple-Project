package com.jsp.apnahealthcheckupspringbootrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.apnahealthcheckupspringbootrestapi.dto.Admin;
import com.jsp.apnahealthcheckupspringbootrestapi.response.ResponseStructure;
import com.jsp.apnahealthcheckupspringbootrestapi.service.AdminService;


@RestController
public class AdminController {
  
	@Autowired
    AdminService service;
	
	@PostMapping(value = "/saveAdmin")
	public ResponseStructure<Admin> saveAdminController(@RequestBody Admin admin){
		
	  return service.saveAdminService(admin); 
	}
	
	@GetMapping(value = "/loginAdmin/{adminEmail}/{adminPassward}")
	public ResponseStructure<Admin> loginAdminController(@PathVariable String adminEmail,@PathVariable String adminPassward){
		return service.loginAdminService(adminEmail, adminPassward);
	}
	
	@RequestMapping(value = "/logoutAdmin")
	public ResponseStructure<String> adminLogoutService(){
		return service.adminLogoutService();
		
	}
}
