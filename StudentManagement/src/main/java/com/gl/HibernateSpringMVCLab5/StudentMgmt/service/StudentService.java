package com.gl.HibernateSpringMVCLab5.StudentMgmt.service;

import com.gl.HibernateSpringMVCLab5.StudentMgmt.model.Student;
import java.util.List;

public interface StudentService {
	
	public List<Student> findAll();
	public Student findById(long studentId);
	public void save(Student student  );
	public void delete(long studentId);
	
}