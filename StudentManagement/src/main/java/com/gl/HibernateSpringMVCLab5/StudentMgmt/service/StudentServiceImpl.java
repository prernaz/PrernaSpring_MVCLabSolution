package com.gl.HibernateSpringMVCLab5.StudentMgmt.service;

import java.util.List;



import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.HibernateSpringMVCLab5.StudentMgmt.model.Student;

@Repository
public class StudentServiceImpl implements StudentService{
     
	private SessionFactory sessionfactory;
     private Session session;
     
     @Autowired
     public StudentServiceImpl(SessionFactory sessionfactory) {
	    super();
		this.sessionfactory = sessionfactory;
		try {
			this.session = this.sessionfactory.getCurrentSession();
		}catch(HibernateException exptn) {
			this.session = this.sessionfactory.openSession();
		}
	}
		
	@Override
	public List<Student> findAll() {
			List<Student>  students = this.session.createQuery("From Student").list();
		    return students;
	}

	@Override
	public Student findById(long studentId) {
		Student student = this.session.get(Student.class,studentId);
		return student;
	}

	@Override
	@Transactional
	public void save(Student student) {
		Transaction tx = this.session.beginTransaction();
		this.session.saveOrUpdate(student);
		tx.commit();
	}

	@Override
	@Transactional
	public void delete(long studentId) {
		Transaction tx = this.session.beginTransaction();
		Student student = this.session.get(Student.class,studentId);
		this.session.delete(student);
		tx.commit();
	}

}
