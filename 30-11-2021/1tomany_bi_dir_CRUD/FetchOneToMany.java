package com.hibernate.mapping.onetomany;

import javax.persistence.*;

public class FetchOneToMany {
	public static void main(String[] args) {
		EntityManagerFactory factory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			factory=Persistence.createEntityManagerFactory("mapping");
			entityManager=factory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Cities cities=new  Cities();
			Cities find = entityManager.find(Cities.class,1);
			String cityName = find.getCityName();
			System.out.println(cityName);
			
			
			entityTransaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
