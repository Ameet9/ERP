package com.inst.erp.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.inst.erp.dao.AdminDao;
import com.inst.erp.pojo.Admin;
import com.inst.erp.pojo.Faculty;
import com.inst.erp.pojo.Student;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDao dao;
	
	@Override
	public Admin authenticate(Admin admin) {
		Admin temp=new Admin();
		temp.setEmail(admin.getEmail());
		temp.setPassword(admin.getPassword());
		
		Example<Admin> exampleAdmin=Example.of(temp);
		
		Optional<Admin> optional=dao.findOne(exampleAdmin);
		
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;
	}

	@Override
	public boolean registerStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean registerFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return false;
	}

}
