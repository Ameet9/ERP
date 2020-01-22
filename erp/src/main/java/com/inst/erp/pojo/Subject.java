package com.inst.erp.pojo;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Subject {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer s_id;
private String s_name;
private String stud_status;
private String lec_status;
@ManyToOne
@JoinColumn(name = "faculty_id")
private Faculty selectedFaculty;
@ManyToOne
@JoinColumn(name = "course_id")
private Course selectedCourse;
private Double maxMarks;
private Double minMarks; 
}