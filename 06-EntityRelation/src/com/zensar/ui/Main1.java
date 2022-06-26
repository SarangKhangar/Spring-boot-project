package com.zensar.ui;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import com.zensar.bean.pack1.ContactInfo;
import com.zensar.bean.pack1.Person;
import com.zensar.util.JPAUtil;

public class Main1 {
	
	static void test1() {
		
		Person person = new Person("Bella", 'F',LocalDate.of(2000, 10, 10));
		person.setPersonId(1002);
		ContactInfo contactInfo = new ContactInfo("bella22@gmail.com","5566778899");
		person.setContactInfo(contactInfo);
		contactInfo.setPerson(person);
		
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	
	static void deleting() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		Person person = em.find(Person.class, 1);
		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		}
	
	static void update() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		Person person = em.find(Person.class, 1002);
		person.getContactInfo().setPhoneNo("1234567890");
        em.getTransaction().begin();
        em.merge(person);
        em.getTransaction().commit();
        JPAUtil.shutDown();
	}
	
	static void load() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		Person person = em.find(Person.class, 1002);
		System.out.println(person);
        JPAUtil.shutDown();
        }
	
	static void test3() {
		EntityManager em = JPAUtil.createEntityManager("JPAIntro");
		ContactInfo contactInfo = em.find(ContactInfo.class, 1002);
		System.out.println(contactInfo);
		System.out.println(contactInfo.getPerson());
        JPAUtil.shutDown();
        }

	public static void main(String[] args) {
		test3();
	}

}
