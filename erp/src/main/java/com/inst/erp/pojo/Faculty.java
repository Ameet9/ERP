package com.inst.erp.pojo;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Faculty {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer facultyId;
	private String fname;
	private String lname;
	private String gender;
	private String address;
	private String city;
	private String state;
	private String email;
	private String qualification;
	@OneToMany(mappedBy = "selectedFaculty",cascade = CascadeType.ALL)
	private List<Subject> subjectList;
	private String experience;
	private LocalDate j_date;
	private Integer mobileNum;
	private String username;
	private String password;
	private void addSubject(Subject s)
	{
		subjectList.add(s);
	}
	public Faculty() {
		super();
		System.out.println("Faculty default constr");
	}
	public Faculty(String fname, String lname, String gender, String address, String city, String state, String email,
			String qualification, String experience, LocalDate j_date, Integer mobileNum, String username,
			String password) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.qualification = qualification;
		this.experience = experience;
		this.j_date = j_date;
		this.mobileNum = mobileNum;
		this.username = username;
		this.password = password;
	}
	public Integer getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
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
	public List<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
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
	@Override
	public String toString() {
		return "Faculty [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", email=" + email + ", qualification=" + qualification
				+ ", experience=" + experience + ", j_date=" + j_date + ", mobileNum=" + mobileNum + ", username="
				+ username + ", password=" + password + "]";
	}
	
}