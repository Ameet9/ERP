package com.inst.erp.pojo;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer c_id;
private String c_name;
@OneToMany(mappedBy="selectedCourse",cascade = CascadeType.ALL)
private List<Student> stud_list=new ArrayList<>();
@OneToMany(mappedBy = "selectedCourse",cascade = CascadeType.ALL)
private List<Subject> sub_list=new ArrayList<>();
private Integer strength;
private LocalDate c_start;
private LocalDate c_end;
private String c_status;
private String c_days;
private void addStudent(Student s)
{
	stud_list.add(s);
}
private void addSubject(Subject s)
{
	sub_list.add(s);
}
public Course() {
	super();
	System.out.println("In course constr");
}
public Course(String c_name, Integer strength, LocalDate c_start, LocalDate c_end, String c_status, String c_days) {
	super();
	this.c_name = c_name;
	this.strength = strength;
	this.c_start = c_start;
	this.c_end = c_end;
	this.c_status = c_status;
	this.c_days = c_days;
}
public Integer getC_id() {
	return c_id;
}
public void setC_id(Integer c_id) {
	this.c_id = c_id;
}
public String getC_name() {
	return c_name;
}
public void setC_name(String c_name) {
	this.c_name = c_name;
}
public List<Student> getStud_list() {
	return stud_list;
}
public void setStud_list(List<Student> stud_list) {
	this.stud_list = stud_list;
}
public List<Subject> getSub_list() {
	return sub_list;
}
public void setSub_list(List<Subject> sub_list) {
	this.sub_list = sub_list;
}
public Integer getStrength() {
	return strength;
}
public void setStrength(Integer strength) {
	this.strength = strength;
}
public LocalDate getC_start() {
	return c_start;
}
public void setC_start(LocalDate c_start) {
	this.c_start = c_start;
}
public LocalDate getC_end() {
	return c_end;
}
public void setC_end(LocalDate c_end) {
	this.c_end = c_end;
}
public String getC_status() {
	return c_status;
}
public void setC_status(String c_status) {
	this.c_status = c_status;
}
public String getC_days() {
	return c_days;
}
public void setC_days(String c_days) {
	this.c_days = c_days;
}
@Override
public String toString() {
	return "Course [c_id=" + c_id + ", c_name=" + c_name + ", strength=" + strength + ", c_start=" + c_start
			+ ", c_end=" + c_end + ", c_status=" + c_status + ", c_days=" + c_days + "]";
}


}