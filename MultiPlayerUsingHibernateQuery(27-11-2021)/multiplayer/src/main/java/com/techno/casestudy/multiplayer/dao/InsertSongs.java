package com.techno.casestudy.multiplayer.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.techno.casestudy.multiplayer.dto.Songs;


public class InsertSongs {
public static void main(String[] args) {
	Scanner scanner=new  Scanner(System.in);
	EntityManagerFactory factory=null;
	 EntityManager entityManager=null;
	 EntityTransaction transaction=null;
	 try {
	 factory = Persistence.createEntityManagerFactory("multiplayer");
	 entityManager = factory.createEntityManager();
	transaction=entityManager.getTransaction();
	
	 transaction.begin();
	 Songs songs=new Songs();
	 
	 entityManager.persist(songs);
	 System.out.println("Enter how much songs you want to load...");
	 int noOfSongs=scanner.nextInt();
	int j=11;
	 for(int i=1;i<=noOfSongs;i++) {
		 songs.setSongNo(j++);
		 System.out.println("Enter the Song name");
		 scanner.nextLine();
		 String nextLine = scanner.nextLine();
		 songs.setSongName(nextLine);

		 System.out.println("Enter the Singer Name");
	
		 String nextLine2 = scanner.nextLine();
		 songs.setSinger(nextLine2);
		 
		 System.out.println("Enter the Duration");
		 double nextDouble = scanner.nextDouble();
		 songs.setDuraion(nextDouble);

		
	 }
	 
	 transaction.commit();
	 
	 
	 }catch (Exception e) {
		 e.printStackTrace();
	}
	 
}
}

