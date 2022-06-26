package copm.zensar.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.zensar.bean.Doctor;
import com.zensar.util.JPAUtil;

public class Main2 {
	
	static void test1() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		
		TypedQuery<Doctor> query = em.createNamedQuery("findAll", Doctor.class);
		List<Doctor> doctors = query.getResultList();
		System.out.println(doctors);
		JPAUtil.shutDown();
	}
	
	static void test2() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		
		TypedQuery<Doctor> query = em.createNamedQuery("findByGender", Doctor.class);
        query.setParameter("searchGender", "female");
        List<Doctor> doctors = query.getResultList();
      //  Doctor doctors = query.getSingleResult();
		System.out.println(doctors);
		JPAUtil.shutDown();
	}
	
	static void update2() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
        
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updateAllFees");
		System.out.println(query.executeUpdate());
		
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	
	static void update1() {
EntityManager em = JPAUtil.createEntityManager("JPAIntro");
        
		Doctor doctor = em.find(Doctor.class, 2);
		doctor.setFees(500); 
		em.getTransaction().begin();
		em.merge(doctor);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	
	static void update() {
EntityManager em = JPAUtil.createEntityManager("JPAIntro");
        
		em.getTransaction().begin();
		Query query = em.createNamedQuery("updateFees");
		query.setParameter("searchName", "Abhi");
		System.out.println(query.executeUpdate());
		
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	public static void main(String[] args) {
		test2();
	}

}
