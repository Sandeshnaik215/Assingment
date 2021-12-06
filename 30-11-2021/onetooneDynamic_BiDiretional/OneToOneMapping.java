package com.hibernate.mapping.onetoone;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToOneMapping {
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
		Scanner sc=new Scanner(System.in);
		System.out.print("How much Data You want to enter : ");
		int nextInt = sc.nextInt();
		for(int i=1;i<=nextInt;i++) {
		System.out.print("Enter the Mother Name : ");
		sc.nextLine();
		String nextLine = sc.nextLine();
		System.out.print("Enter the Location : ");
		
		String nextLine2 = sc.nextLine();
		System.out.print("Enter the father Name : ");
		String nextLine3 = sc.nextLine();

		System.out.print("Enter the Son Name : ");
		String nextLine4 = sc.nextLine();
		mother.setName(nextLine);
		mother.setLoc(nextLine2);
		mother.setSonName(nextLine4);
		
		Father father=new Father();

		father.setName(nextLine3);
		mother.setFather(father);
	entityManager.persist(mother);
	entityTransaction.commit();
		
		}
		System.out.println("1.See All Details\n2.Exit");
		int nextInt2 = sc.nextInt();
		switch (nextInt2) {
		case 1:
			showAll(entityManager,nextInt);
			break;
	case 2:
			exit();
			break;

		default:
			break;
		}
	
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}

private static void exit() {
System.out.println("Thakyou....");	
}

private static void showAll(EntityManager entityManager, int nextInt) {
	Mother mother=new  Mother();
	for(int i=1;i<=nextInt;i++) {
	Mother find = entityManager.find(Mother.class, i);
	Father father=new Father();
	
	System.out.println(nextInt+".Son_Name : "+find.getSonName()+" -->Father_Name : "+father.getName()+"-->Mother_Name : "+find.getName()
	+"-->Location : "+find.getLoc()+""
			);

	}
	
}
}
