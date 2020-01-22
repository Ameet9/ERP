package com.inst.erp.services;

import com.inst.erp.pojo.Admin;
import com.inst.erp.pojo.Faculty;
import com.inst.erp.pojo.Student;

public interface AdminService {

	public Admin authenticate(Admin admin);
	public boolean registerStudent(Student student);
	public boolean registerFaculty(Faculty faculty);
}
