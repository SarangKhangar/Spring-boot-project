package com.zensar.bean.pack2;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="course10")

public class Course {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int courseId;
	
	@Column
	String courseName;
	
	@Column
	double fees;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="c_id")
	Set<Subject> Subject;

	public Course(String courseName, double fees, Set<com.zensar.bean.pack2.Subject> subject) {
		super();
		this.courseName = courseName;
		this.fees = fees;
		Subject = subject;
	}

	public Course() {
		super();
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public Set<Subject> getSubject() {
		return Subject;
	}

	public void setSubject(Set<Subject> subject) {
		Subject = subject;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", fees=" + fees + ", Subject=" + Subject
				+ "]";
	}

	
}
