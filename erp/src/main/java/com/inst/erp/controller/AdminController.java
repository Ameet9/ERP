package com.inst.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inst.erp.pojo.Admin;
import com.inst.erp.services.AdminService;



@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class AdminController {

	@Autowired
	AdminService service;
	
	@RequestMapping(value="/adminauthenticate",method = RequestMethod.POST)
	public ResponseEntity<?> m1(@RequestBody Admin admin)
	{
		Admin temp=service.authenticate(admin);
		
		if(temp!=null)
		{
			return new ResponseEntity<Admin>(admin,HttpStatus.OK);
		}
		return new ResponseEntity<String>("Authentication Failed ",HttpStatus.OK);
	}
}
