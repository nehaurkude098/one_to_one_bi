package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonDetails {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);
		
		EntityManager entityManager=entityManagerFactory.createEntityManager(); 
		Person person=new Person();
		person.setName("ali");
		person.setGender("male");
		
		Pan pan=new Pan();
		pan.setPerson(person);
		pan.setNo(78678945678l);
		pan.setType("general");
		person.setPan(pan);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		
		entityTransaction.commit();

	}

}
