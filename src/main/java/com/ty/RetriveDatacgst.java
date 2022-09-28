package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RetriveDatacgst {
	
		public static void main(String[] args) {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
			System.out.println(entityManagerFactory);

			EntityManager entityManager = entityManagerFactory.createEntityManager();
			GST g = entityManager.find(GST.class, 1);
			System.out.println("---------gst details--------  ");
			System.out.println("id is "+g.getId());
			System.out.println("no is "+g.getNo());
			System.out.println("status is "+g.getStatus());
			
			Company company=g.getCompany();
			if(company!=null) {
				System.out.println("---------company details--------  ");
				System.out.println("id is "+company.getId());
				System.out.println("name is "+company.getName());
				System.out.println("address is "+company.getAddress());
			}
			
			
}
}