package com.zensar.ui;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.EntityManager;
import com.zensar.bean.pack2.Course;
import com.zensar.bean.pack2.Subject;
import com.zensar.util.JPAUtil;

public class Main2 {
	
	static void test1() {
		Subject subject1 = new Subject("HTML", 10);
		Subject subject2 = new Subject("CSS", 20);
		Subject subject3 = new Subject("JS", 30);
		Subject subject4 = new Subject("REACT", 40);
		
		Set<Subject> subjects = new HashSet<>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		subjects.add(subject4);

		Course course = new Course("Software Development", 30000, subjects);
		
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        JPAUtil.shutDown();
        }
	
	static void test2() {
		
		Subject subject1 = new Subject("asd", 50);
		Subject subject2 = new Subject("qwe", 60);
		Subject subject3 = new Subject("zxc", 70);
		Subject subject4 = new Subject("pol",80);
		Set<Subject> subject = new HashSet<>();
		subject.add(subject1);
		subject.add(subject2);
		subject.add(subject3);
		subject.add(subject4);
		
		Course course= new Course("Code Devloper", 60000, subject);
		
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	
	static void test3() {
		Subject subject1 = new Subject("HTML", 10);
		Subject subject2 = new Subject("CSS", 20);
		Subject subject3 = new Subject("JS", 30);
		Subject subject4 = new Subject("REACT", 40);
		Subject subject5 = new Subject("asd", 50);
		Subject subject6 = new Subject("qwe", 60);
		Set<Subject> subjects = new HashSet<>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		subjects.add(subject4);
		subjects.add(subject5);
		subjects.add(subject6);
		
		Course course = new Course("Combo", 100000, subjects);
		
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
	    em.getTransaction().begin();
	    em.persist(course);
	    em.getTransaction().commit();
		JPAUtil.shutDown();

	    }
	
	static void load() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		Course course = em.find(Course.class, 2);
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		System.out.println(course);
		JPAUtil.shutDown();
		}
	
	static void deleting() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		Course course = em.find(Course.class, 5);
		em.getTransaction().begin();
		em.remove(course);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	
	static void update() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		Course course = em.find(Course.class, 5);
		course.setCourseName("nothing");
		course.setFees(00);
		em.getTransaction().begin();
		em.merge(course);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}


	public static void main(String[] args) {
		test1();
	}

}
