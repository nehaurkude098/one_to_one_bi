package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetrieveBikeCharcyDetails {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Bike bike = entityManager.find(Bike.class, 1);
		System.out.println("-----Bike information---------");
		System.out.println("id is " + bike.getId());
		System.out.println("name is " + bike.getName());
		System.out.println("gender is " + bike.getCost());

		Charcy charcy = bike.getCharcy();
		if (charcy != null) {
			System.out.println("----charcy information---");
			System.out.println("id is " + charcy.getId());
			System.out.println("type is " + charcy.getType());
		}

	}
}
