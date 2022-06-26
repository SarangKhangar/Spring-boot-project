package com.zensar.ui;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.zensar.bean.Person;
import com.zensar.util.HibernateUtil;

public class Main1 {
	
	public static void insert() {
		Person person = new Person();
		person.setName("Abhishek");
		person.setSalary(60000.00);
        Session session=null;
		HibernateUtil.init();
		session=HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();
		HibernateUtil.cleanUp();
		}
	static void Load() {
		Person person = null;
		Session session = null;
		HibernateUtil.init();
		session = HibernateUtil.getSession();
		person = session.load(Person.class, 2);
		System.out.println(person);
		HibernateUtil.cleanUp();
		}
	
	static void LoadAll() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		String qry = "from Persons";
		Query query = session.createQuery(qry);
		List<Person> allPerson = query.list(); 
		System.out.println(allPerson);
		HibernateUtil.cleanUp();
		}
	
	static void editing() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Person person = session.load(Person.class, 2);
		person.setSalary(100000.00);
		Transaction tx = session.beginTransaction();
		session.update(person);
		tx.commit();
		HibernateUtil.cleanUp();
		}
	
	static void deleting() {
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Person person = session.load(Person.class, 3);
		Transaction tx = session.beginTransaction();
		session.delete(person);
		tx.commit();
		HibernateUtil.cleanUp();
		}
	
	public static void main(String[] args) {
		deleting();
		}
	}
