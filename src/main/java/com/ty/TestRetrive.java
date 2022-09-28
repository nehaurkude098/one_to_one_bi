package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestRetrive {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, 1);
		System.out.println("-----person information---------");
		System.out.println("id is " + person.getId());
		System.out.println("name is " + person.getName());
		System.out.println("gender is " + person.getGender());
		Pan pan = person.getPan();
		if (pan != null) {
			System.out.println("----pan information---");
			System.out.println("id is " + pan.getId());
			System.out.println("no is " + pan.getNo());
			System.out.println("type is " + pan.getType());
		}

	}
}