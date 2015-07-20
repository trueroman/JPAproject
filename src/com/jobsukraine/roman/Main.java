package com.jobsukraine.roman;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("UNIT");
		EntityManager em = emf.createEntityManager();
		Cars car = new Cars();
		car.setName("BMW");
		car.setPrice(10000);
		Cars car2 = new Cars();
		car2.setName("AUDI");
		car2.setPrice(15000);
		Cars car3 = new Cars();
		car3.setName("VOLGA");
		car3.setPrice(1000);
		em.getTransaction().begin();
		em.persist(car);
		em.persist(car2);
		em.persist(car3);
		em.getTransaction().commit();
	}
}
