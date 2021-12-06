package com.hibernate.mapping.onetomany;

import java.util.ArrayList;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import antlr.collections.List;

public class OneToMany {
public static void main(String[] args) {
	EntityManagerFactory factory=null;
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
		factory=Persistence.createEntityManagerFactory("mapping");
		entityManager=factory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		State state=new State();
		state.setIdc(1);
		state.setState_n("Karnataka");
		Cities c1=new Cities();
		c1.setId(1);
		c1.setCityName("Dharwad");
		Cities c2=new Cities();
		c2.setId(2);
		c2.setCityName("Hubli");
		Cities c3=new Cities();
		c3.setId(3);
		c3.setCityName("Udupi");
		Cities c4=new Cities();
		c4.setId(4);
		c4.setCityName("Sirsi");
		java.util.List<Cities> list = Arrays.asList(c1,c2,c3,c4);
		state.setCities(list);
		entityManager.persist(state);
		
		entityTransaction.commit();
		
}catch (Exception e) {
	e.getCause();// TODO: handle exception
}
}
}