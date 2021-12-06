package com.hibernate.mapping.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToOne {
	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("mapping");
			entityManager=factory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			
			Box box1=new Box();
			box1.setName("Cello");
			Pen pen=new Pen();
			pen.setName("Gripper");
			pen.setBox(box1);
			entityManager.persist(pen);
			
			Pen pen1=new Pen();
			pen1.setName("Gripper");
			pen1.setBox(box1);
			entityManager.persist(pen1);
			
			Pen pen2=new Pen();
			pen2.setName("slipper");
			pen2.setBox(box1);
			entityManager.persist(pen2);
			
			entityTransaction.commit();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
