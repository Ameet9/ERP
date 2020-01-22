package com.inst.erp.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer studentId;
private String fname;
private String lname;
private String gender;
private String address;
private String city;
private String state;
private String email;
private String qualification;
//use course 'pk' to refer course-----acts as fk
@ManyToOne
@JoinColumn(name ="course_id")
private Course selectedCourse;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private LocalDate j_date;
private Integer mobileNum;
private String username;
private String password;
private String status;
public Student() {
	System.out.println("Student pojo constr");
}
public Student(String fname, String lname, String gender, String address, String city, String state, String email,
		String qualification, LocalDate j_date, Integer mobileNum, String username, String password, String status) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.gender = gender;
	this.address = address;
	this.city = city;
	this.state = state;
	this.email = email;
	this.qualification = qualification;
	this.j_date = j_date;
	this.mobileNum = mobileNum;
	this.username = username;
	this.password = password;
	this.status = status;
}
public Integer getStudentId() {
	return studentId;
}
public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public Course getSelectedCourse() {
	return selectedCourse;
}
public void setSelectedCourse(Course selectedCourse) {
	this.selectedCourse = selectedCourse;
}
public LocalDate getJ_date() {
	return j_date;
}
public void setJ_date(LocalDate j_date) {
	this.j_date = j_date;
}
public Integer getMobileNum() {
	return mobileNum;
}
public void setMobileNum(Integer mobileNum) {
	this.mobileNum = mobileNum;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender
			+ ", address=" + address + ", city=" + city + ", state=" + state + ", email=" + email + ", qualification="
			+ qualification + ", j_date=" + j_date + ", mobileNum=" + mobileNum
			+ ", username=" + username + ", status=" + status + "]";
}

}