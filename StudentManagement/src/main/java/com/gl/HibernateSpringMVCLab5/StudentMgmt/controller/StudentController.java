package com.gl.HibernateSpringMVCLab5.StudentMgmt.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.context.Theme;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.HibernateSpringMVCLab5.StudentMgmt.model.Student;
import com.gl.HibernateSpringMVCLab5.StudentMgmt.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

@Autowired
private StudentService studentservice;

@RequestMapping("/list")
public  String listStudents(Model theModel) {
	
	List<Student> theStudents = studentservice.findAll();
	theModel.addAttribute("students", theStudents);
	return "list-students";
}

@RequestMapping("/showFormForAdd")
public  String showFormForAdd(Model theModel) { 
	
	Student student = new Student();
	theModel.addAttribute("student", student);
	theModel.addAttribute("mode", "Add");
	return "student-form";
}

@RequestMapping("/showFormForUpdate")
public  String showFormForUpdate(@RequestParam("studentId") long studentId, Model theModel) { 
	
	Student student = studentservice.findById(studentId);
	theModel.addAttribute("student", student);
	theModel.addAttribute("mode", "Update");
	return "student-form";
}

@PostMapping("/save")
public  String saveStudent(@RequestParam("studentId") long studentId, 
		@RequestParam("firstName") String firstName,
		@RequestParam("lastName") String lastName,
		@RequestParam("course") String course,
	    @RequestParam("country") String country){
	       
	   Student student = null;
	   if(studentId==0) {
		 student = new Student(firstName,lastName,course,country);
	    }
	  
	   else { 
		student = studentservice.findById(studentId);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setCourse(course);
		student.setCountry(country);
	}
	   
	   studentservice.save(student);
	  	return "redirect:list";
 }

 @RequestMapping("/delete")
  public String delete(@RequestParam("studentId") long studentId) {
	
	studentservice.delete(studentId);
	return "redirect:list";
   }
  }
 
