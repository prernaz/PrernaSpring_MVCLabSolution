package com.gl.HibernateSpringMVCLab5.StudentMgmt.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*Entity Bean with JPA Annotations
 * Hibernate provides JPA Implementations
 */
@Entity
@Table(name="student")
public class Student {
		@Id
	    @Column(name="id")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long studentId;
	    @Column(name="fname")
		private String firstName;
	    @Column(name="lname")
		private String lastName;
	    @Column(name="course")
	    private String course;
	    @Column(name="country")
	    private String country;
	    
        
	    public Student() {
	    	super();
		}
		
		public Student(String firstName, String lastName, String course, String country) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.course = course;
			this.country = country;
		}

		public long getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", course=" + course + ", country=" + country + "]";
		}

}