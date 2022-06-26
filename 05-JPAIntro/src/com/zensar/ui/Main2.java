package com.zensar.ui;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.zensar.bean.Employee;
import com.zensar.util.JPAUtil;

public class Main2 {
	static void insert() {
		 EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		 
		 Employee employee = new Employee();
		 employee.setName("Tejas");
		 employee.setDateOfJoining(LocalDate.of(2022, 03, 28));
		 employee.setBasic(25.0);
		 employee.setGrade('E');
		 
		 em.getTransaction().begin();
		 em.persist(employee);
		 em.getTransaction().commit();
		 JPAUtil.shutDown();

	}
	
	static void Load() {
        EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		 
        Employee employee = em.find(Employee.class, 2);
		 System.out.println(employee);
		 JPAUtil.shutDown();

	}
	
	static void update() {
        EntityManager em = JPAUtil.createEntityManager("JPAIntro");
        
        Employee employee = em.find(Employee.class, 2);
        employee.setBasic(22.0);
        employee.setGrade('E');
        employee.setDateOfJoining(LocalDate.of(2021, 12, 15));
        em.getTransaction().begin();
        em.merge(employee);
        em.getTransaction().commit();
        System.out.println(employee);
		JPAUtil.shutDown();

	}
	
	static void deleting() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		
		Employee employee = em.find(Employee.class, 1);
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();
		JPAUtil.shutDown();

	}
	
	static void loadAll() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		
		String qry = "from Employee";
		Query query = em.createQuery(qry);
		List<Employee> empAll = query.getResultList();
		empAll.forEach(System.out::println);
	}

	public static void main(String[] args) {
     loadAll();
	}

}
