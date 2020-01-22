package com.inst.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inst.erp.dao.StudentDao;
import com.inst.erp.pojo.Student;

@RestController
public class StudentController {
@Autowired
private StudentDao dao;
@CrossOrigin(origins = "http://localhost:4200")
@PostMapping("/register")
public ResponseEntity<?> registerStudent(@RequestBody Student student){
	System.out.println(student);
	dao.save(student);
	return new ResponseEntity<String>("congrats",HttpStatus.OK);
}
}
