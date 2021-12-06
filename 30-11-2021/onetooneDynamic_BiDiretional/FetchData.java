package com.hibernate.mapping.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchData {
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
			String name = find.getName();
			Father father = find.getFather();
			
			String name2 = father.getName();
			System.out.println(name+name2);
		entityTransaction.commit();
		
		}catch (Exception e) {
			// TODO: handle exception
		}}
}
