package com.inst.erp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inst.erp.pojo.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, String>{

}
