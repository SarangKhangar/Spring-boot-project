package com.zensar.ui;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.bean.Employee;
import com.zensar.util.HibernateUtil;

public class Main2 {
	static void insert() {
		Employee employee = new Employee();
		employee.setName("Tejas");
		employee.setDateOfJoining(LocalDate.of(2021, 12, 15));
		employee.setBasic(27000.00);
		employee.setGrade('E');
		
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(employee);
		tx.commit();
		HibernateUtil.cleanUp();
		}
	
	static void Load() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Employee employee = session.load(Employee.class, 2);
		System.out.println(employee);
		 HibernateUtil.cleanUp();
	}
	
	static void deleting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Employee employee = session.load(Employee.class, 4);
		Transaction tx = session.beginTransaction();
		session.delete(employee);
		tx.commit();
		HibernateUtil.cleanUp();
	}
	
	static void LoadAll() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		String qry = "from empoyees";
		Query query = session.createQuery(qry);
		List<Employee> allemployee = query.list();
		System.out.println(allemployee);
	}
	
	static void editing() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Employee employee = session.load(Employee.class, 3);
		employee.setBasic(25000.00);
		Transaction tx = session.beginTransaction();
		session.update(employee);
		tx.commit();
		HibernateUtil.cleanUp();
	}

	public static void main(String[] args) {
	    deleting();
	}

}
