package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveDetailsBikeCharcy {

	public static void main(String[] args) {
		
		Bike bike = new Bike();
		bike.setName("alisha");
		bike.setCost(100000.00);

		Charcy charcy = new Charcy();
		charcy.setType("bikeee");
		charcy.setBike(bike);
		bike.setCharcy(charcy);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bike);
		entityManager.persist(charcy);

		entityTransaction.commit();

	}
}
