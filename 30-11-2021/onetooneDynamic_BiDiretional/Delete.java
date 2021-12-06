package com.hibernate.mapping.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("mapping");
			entityManager=factory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Mother mother=new  Mother();
			Mother find = entityManager.find(Mother.class, 1);
			entityManager.remove(find);

			System.out.println("Done");
		entityTransaction.commit();
		
		}catch (Exception e) {
			// TODO: handle exception
		}}
}
