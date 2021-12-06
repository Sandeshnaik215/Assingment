package com.hibernate.mapping.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateManyToOne {
	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("mapping");
			entityManager=factory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Pen pen=new Pen();
			
			 Pen find = entityManager.find(Pen.class , 3);
			 find.setName("celco");
		entityTransaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
		}
}
}
