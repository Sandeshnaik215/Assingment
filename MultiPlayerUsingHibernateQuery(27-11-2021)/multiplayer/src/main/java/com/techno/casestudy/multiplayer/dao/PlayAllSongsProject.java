package com.techno.casestudy.multiplayer.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.techno.casestudy.multiplayer.dto.Songs;

public class PlayAllSongsProject {
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;

	static Scanner scanner = new Scanner(System.in);

	public static void basicThing() {

		factory = Persistence.createEntityManagerFactory("multiplayer");
		entityManager = factory.createEntityManager();
	}

	public static void playAllSongs() {
		basicThing();
		String st = "Playing all the Songs.....";
		char[] chr = st.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String query = "from Songs";
		Query createQuery = entityManager.createQuery(query);
		List resultList = createQuery.getResultList();
		for (Object object : resultList) {
			System.out.println(object);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String st6 = "1.Main Menu\n2.Exit\n";
		char[] chr6 = st6.toCharArray();
		for (int i2 = 0; i2 < chr6.length; i2++) {
			System.out.print(chr6[i2]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int userInput2 = scanner.nextInt();
		if (userInput2 == 1) {
			menu();
		} else if (userInput2 == 2) {
			exit();
		} else {
			System.out.println("Invalid Input");
		}
	}

	public static void menu() {

		String st = "WellCome to my Playlist\n1.Play Songs\n2.Search Songs\n3.Operation\n4.Exit\n";
		char[] chr = st.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		int userInput = scanner.nextInt();
		switch (userInput) {
		case 1:
			playSongs();
			break;
		case 2:
			serachSongs();
			break;
		case 3:
			operation();
			break;
		case 4:
			exit();
			break;
		default:
			System.out.println("Invalid entry...");
			break;

		}

	}

	public static void main(String[] args) {
		menu();

	}

	private static void exit() {
		System.out.println("");
		String st = "Thank you ...\nI hope you Enjoyed";
		char[] chr1 = st.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void operation() {
		String st = "What operation you want to do\n1.Add Songs\n2.Remove Songs\n";
		char[] chr1 = st.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int userInput = scanner.nextInt();
		switch (userInput) {
		case 1:
			addSong();
			break;
		case 2:
			removeSong();
			break;
		default:
			System.out.println("Invalid User Input");
			break;

		}

	}

	private static void removeSong() {
		basicThing();
		EntityTransaction transaction = null;
		transaction = entityManager.getTransaction();
		transaction.begin();
		System.out.println("Playing all the Songs.....");
		String query11 = "from Songs";
		Query createQuery11 = entityManager.createQuery(query11);
		java.util.List resultList11 = createQuery11.getResultList();
		for (Object object : resultList11) {
			System.out.println(object);
		}
		String st = "enter the Song no which you want to delete : ";
		char[] chr = st.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		int no = scanner.nextInt();

		String query2 = "delete from Songs where songNo=" + no;
		Query createQuery = entityManager.createQuery(query2);
		int executeUpdate = createQuery.executeUpdate();
		transaction.commit();
		if (executeUpdate != 0) {
			String st1 = "Song Deleted Successfully\nUpdated Playlist : \nPlaying all the Songs.....";
			char[] chr1 = st1.toCharArray();
			for (int i = 0; i < chr1.length; i++) {
				System.out.print(chr1[i]);
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			String query1 = "from Songs";
			Query createQuery1 = entityManager.createQuery(query1);
			java.util.List resultList1 = createQuery1.getResultList();
			for (Object object : resultList1) {
				System.out.println(object);
			}
			String st6 = "1.Remove More Songs\n2.Main Menu\n3.Exit\n";
			char[] chr6 = st6.toCharArray();
			for (int i2 = 0; i2 < chr6.length; i2++) {
				System.out.print(chr6[i2]);
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			int userInput2 = scanner.nextInt();
			if (userInput2 == 1) {
				removeSong();
			} else if (userInput2 == 2) {
				menu();
			} else if (userInput2 == 3) {
				exit();
			} else {
				System.out.println("Invalid Input");
			}
		}
	}

	private static void addSong() {
		int executeUpdate;

		String st1 = "How much you want to add : ";
		char[] chr1 = st1.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int no = scanner.nextInt();
		for (int i = 1; i <= no; i++) {

			String st3 = "Enter the Name  of the Song : ";
			char[] chr3 = st3.toCharArray();
			for (int i2 = 0; i2 < chr3.length; i2++) {
				System.out.print(chr3[i2]);
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			scanner.nextLine();
			String name = scanner.nextLine();
			String st4 = "Enter the Singer name : ";
			char[] chr4 = st4.toCharArray();
			for (int i2 = 0; i2 < chr4.length; i2++) {
				System.out.print(chr4[i2]);
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			String sname = scanner.nextLine();
			String st5 = "Song Duration in min : ";
			char[] chr5 = st5.toCharArray();
			for (int i2 = 0; i2 < chr5.length; i2++) {
				System.out.print(chr5[i2]);
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			double du = scanner.nextDouble();
			basicThing();
			EntityTransaction transaction = null;
			transaction = entityManager.getTransaction();
			transaction.begin();
			Songs s = new Songs(name, sname, du);
			entityManager.persist(s);
			transaction.commit();
		}
		String st6 = "Song added Sucessfully\nUpdated Playlist : \nPlaying all the Songs.....";
		char[] chr6 = st6.toCharArray();
		for (int i2 = 0; i2 < chr6.length; i2++) {
			System.out.print(chr6[i2]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String query1 = "from Songs";
		Query createQuery1 = entityManager.createQuery(query1);
		java.util.List resultList1 = createQuery1.getResultList();
		for (Object object : resultList1) {
			System.out.println(object);
		}
		String st7 = "1.Main Menu\n2.Exit\n";
		char[] chr7 = st7.toCharArray();
		for (int i2 = 0; i2 < chr7.length; i2++) {
			System.out.print(chr7[i2]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int userInput2 = scanner.nextInt();
		if (userInput2 == 1) {
			menu();
		} else if (userInput2 == 2) {
			exit();
		} else {
			System.out.println("Invalid Input");
		}
	}

	private static void operationBasic() {
		basicThing();
		entityManager.getTransaction();
	}

	private static void serachSongs() {
		basicThing();
		System.out.print("Enter the Song Name : ");
		scanner.nextLine();
		String userInput = scanner.nextLine();
		String query = "select songName from Songs";
		Query createQuery = entityManager.createQuery(query);
		java.util.List resultList = createQuery.getResultList();
		int no = 0;
		for (Object object : resultList) {

			if (((String) object).equalsIgnoreCase(userInput)) {
				System.out.println("Playing song \n" + object);
				no++;
			}

		}
		if (no != 1) {
			System.out.println("Song is not Found");
		}
		String st6 = "1.Main Menu\n2.Exit\n";
		char[] chr6 = st6.toCharArray();
		for (int i2 = 0; i2 < chr6.length; i2++) {
			System.out.print(chr6[i2]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int userInput2 = scanner.nextInt();
		if (userInput2 == 1) {
			menu();
		} else if (userInput2 == 2) {
			exit();
		} else {
			System.out.println("Invalid Input");
		}
	}

	private static void playSongs() {
		Scanner scanner = new Scanner(System.in);
		String st6 = "1.Play All Songs\n2.Play Perticular Song\n3.Play Random Song\n4.Exit\n";
		char[] chr6 = st6.toCharArray();
		for (int i2 = 0; i2 < chr6.length; i2++) {
			System.out.print(chr6[i2]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int userInput = scanner.nextInt();
		switch (userInput) {
		case 1:
			playAllSongs();
			break;
		case 2:
			playPerticularSong();
			break;
		case 3:
			playRandomSong();
			break;
		case 4:
			exit();
			break;
		default:
			System.out.println("Invalid entry...");
			break;

		}
	}

	private static void playRandomSong() {
		basicThing();

		int n = (int) (Math.random() * 9);
		String query1 = "select songName from Songs where songNo=" + n;
		Query createQuery1 = entityManager.createQuery(query1);
		List resultLis1t = createQuery1.getResultList();
		for (Object object : resultLis1t) {
			System.out.println(object);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		String st6 = "1.Main Menu\n2.Exit\n";
		char[] chr6 = st6.toCharArray();
		for (int i2 = 0; i2 < chr6.length; i2++) {
			System.out.print(chr6[i2]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int userInput21 = scanner.nextInt();
		if (userInput21 == 1) {
			menu();
		} else if (userInput21 == 2) {
			exit();
		} else {
			System.out.println("Invalid Input");
		}
	}

	private static void playPerticularSong() {
		basicThing();
		System.out.println("All Songs");

		String query = "from Songs";
		Query createQuery = entityManager.createQuery(query);
		java.util.List resultList = createQuery.getResultList();
		for (int i = 0; i < resultList.size(); i++) {
			System.out.println(resultList.get(i));
		}
		System.out.println("Enter the song Number that you want to play");
		int userInput2 = scanner.nextInt();

		String query1 = "select songName from Songs where songNo=" + userInput2;
		Query createQuery1 = entityManager.createQuery(query1);
		List resultLis1t = createQuery1.getResultList();
		for (Object object : resultLis1t) {
			System.out.println(object);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		String st6 = "1.Main Menu\n2.Exit\n";
		char[] chr6 = st6.toCharArray();
		for (int i2 = 0; i2 < chr6.length; i2++) {
			System.out.print(chr6[i2]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int userInput21 = scanner.nextInt();
		if (userInput21 == 1) {
			menu();
		} else if (userInput21 == 2) {
			exit();
		} else {
			System.out.println("Invalid Input");
		}
	}
}
