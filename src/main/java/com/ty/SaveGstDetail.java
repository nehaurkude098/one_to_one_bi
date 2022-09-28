package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveGstDetail {
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		System.out.println(entityManagerFactory);
		
		EntityManager entityManager=entityManagerFactory.createEntityManager(); 
		Company company=new Company();
		company.setName("coworks");
		company.setAddress("blr");
		
		GST g=new GST();
		g.setNo("gst11111");
		g.setStatus("paid");
		g.setCompany(company);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(company);
		entityManager.persist(g);
		
		entityTransaction.commit();

}
}