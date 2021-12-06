package com.hibernate.mapping.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class remove {
	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("mapping");
			entityManager=factory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			Pen find = entityManager.find(Pen.class, 3);
			entityManager.remove(find);
			entityTransaction.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
}
}
