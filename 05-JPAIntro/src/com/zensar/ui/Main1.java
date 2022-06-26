package com.zensar.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.zensar.bean.Person;

public class Main1 {
	
	 static void insert() {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		 EntityManager em = emf.createEntityManager();
		 
		 Person person = new Person();
		 person.setName("Abhishek");
		 person.setSalary(20000.00);
		 em.getTransaction().begin();
		 em.persist(person);
		 em.getTransaction().commit();
		 
		 em.close();
		 emf.close();
		 		
	 }
	 
	 static void Load() {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		 EntityManager em = emf.createEntityManager();
		 
		 Person person = em.find(Person.class, 2);
		 System.out.println(person);
		 
		 em.close();
		 emf.close();
		 }
	 
	 static void LoadAll() {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		 EntityManager em = emf.createEntityManager();
		 
		 String qry = "from Person";
		 Query query = em.createQuery(qry);
		 List<Person> allperson = query.getResultList();
		 System.out.println(allperson);
		 
		 em.close();
		 emf.close();
	 }
	 
	 static void updating() {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		 EntityManager em = emf.createEntityManager();
		 Person person = em.find(Person.class, 2);
		 person.setSalary(30.00);
		 em.getTransaction().begin();
		 em.merge(person);
		 em.getTransaction().commit();
		 System.out.println(person);
		 
		 em.close();
		 emf.close();
	 }
	 
	 static void deleting() {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAIntro");
		 EntityManager em = emf.createEntityManager();
		 
		 Person person = em.find(Person.class, 1);
		 em.getTransaction().begin();
		 em.remove(person);
		 
		 em.close();
		 emf.close();
		 }

	public static void main(String[] args) {
		updating();

	}

}
