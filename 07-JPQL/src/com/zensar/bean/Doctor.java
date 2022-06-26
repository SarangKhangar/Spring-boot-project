package com.zensar.bean;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "doctors10")

@NamedQueries(
        {
        @NamedQuery(name="findAll", query = "select d from Doctor d"),
        @NamedQuery(name="findById", query = "select d from Doctor d where d.id=:searchId"),
        @NamedQuery(name="findByGender", query = "select d from Doctor d where d.gender=:searchGender"),
        @NamedQuery(name="updateAllFees", query = "update Doctor set fees=fees+200"),
        @NamedQuery(name="updateFees", query = "update Doctor set fees = 10000 where name=:searchName")
        }
)

@NamedNativeQueries(
		{
    @NamedNativeQuery(name = "readAll", query = "select * from doctors10", resultClass =Doctor.class),
    @NamedNativeQuery(name = "readById", query = "select * from doctors10 where id=?", resultClass =Doctor.class),
    @NamedNativeQuery(name = "readByGender", query = "select * from doctors10 where gender=?", resultClass =Doctor.class)
    }
		)


public class Doctor {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	String name;
	double fees;
	String gender;
	LocalDate practicingFrom;

	public Doctor(String name, double fees, String gender, LocalDate practicingFrom) {
		super();
		this.name = name;
		this.fees = fees;
		this.gender = gender;
		this.practicingFrom = practicingFrom;
	}

	public Doctor() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getPracticingFrom() {
		return practicingFrom;
	}

	public void setPracticingFrom(LocalDate practicingFrom) {
		this.practicingFrom = practicingFrom;
	}

	@Override
	public String toString() {
		return "\n Doctor [id=" + id + ", name=" + name + ", fees=" + fees + ", gender=" + gender + ", practicingFrom="
				+ practicingFrom + "]";
	}

}
