package com.zensar.bean.pack2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subject10")

public class Subject {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int SubjectId;
	
	@Column
	String subjectName;
	
	@Column
	int duratinInHours;

	public Subject(String subjectName, int duratinInHours) {
		super();
		this.subjectName = subjectName;
		this.duratinInHours = duratinInHours;
	}

	public Subject() {
		super();
	}

	public int getSubjectId() {
		return SubjectId;
	}

	public void setSubjectId(int subjectId) {
		SubjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getDuratinInHours() {
		return duratinInHours;
	}

	public void setDuratinInHours(int duratinInHours) {
		this.duratinInHours = duratinInHours;
	}

	@Override
	public String toString() {
		return "Subject [SubjectId=" + SubjectId + ", subjectName=" + subjectName + ", duratinInHours=" + duratinInHours
				+ "]";
	}
    
	
}
