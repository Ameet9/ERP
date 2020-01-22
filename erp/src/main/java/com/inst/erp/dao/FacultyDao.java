package com.inst.erp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inst.erp.pojo.Student;
@Repository
public interface FacultyDao extends JpaRepository<Student, Integer>{

}
