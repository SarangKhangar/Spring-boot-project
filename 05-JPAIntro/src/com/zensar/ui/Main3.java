package com.zensar.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.zensar.bean.Address;
import com.zensar.bean.Students;
import com.zensar.util.JPAUtil;

public class Main3 {
	
	static void insert() {
		
		Address adress = new Address("A-1", "Vasco da Gama", "Goa");
		Students student = new Students();
		student.setName("Roman");
		student.setRollNumber(0002);
		student.setAddress(adress);
		
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		JPAUtil.shutDown();
}
	
	static void update() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		Students student = em.find(Students.class, 2);
		student.setName(student.getName().toUpperCase());
	    student.getAddress().setDooeNumber("A-5");
	    
	    em.getTransaction().begin();
	    em.merge(student);
	    em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	
	static void load() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		Students student = em.find(Students.class, 1);
		System.out.println(student);
		JPAUtil.shutDown();
		}
	
	static void loadAll() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		String qry = "from Students";
		Query query = em.createQuery(qry);
		List<Students> all = query.getResultList();
        System.out.println(all);
        JPAUtil.shutDown();
	}
	
	static void deleting() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
        Students student = em.find(Students.class, 2);
        em.remove(student);
        JPAUtil.shutDown();
	}
	
	
	public static void main(String[] args) {
		loadAll();
	}

}
