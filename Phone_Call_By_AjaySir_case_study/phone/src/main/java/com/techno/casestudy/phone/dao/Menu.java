package com.techno.casestudy.phone.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.techno.casestudy.phone.dto.Call;

public class Menu {
	static EntityManagerFactory factory = null;
	static EntityManager entityManager = null;

	static Scanner scanner = new Scanner(System.in);

	public static void basicThing() {

		factory = Persistence.createEntityManagerFactory("phone");

		entityManager = factory.createEntityManager();
	}

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {

		String st = "WellCome to Contact\n1.Show Contacts\n2.Search Contact\n3.Operation\n4.Exit\n";
		char[] chr = st.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		int userInput = scanner.nextInt();
		switch (userInput) {
		case 1:
			ShowContect();
			break;
		case 2:
			Searchcontect();
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

	private static void Searchcontect() {
		basicThing();
		System.out.print("Enter the Name : ");
		scanner.nextLine();
		String userInput = scanner.nextLine();
		String query = "select name from Call";
		Query createQuery = entityManager.createQuery(query);
		java.util.List resultList = createQuery.getResultList();
		int no = 0;
		for (Object object : resultList) {

			if (((String) object).equalsIgnoreCase(userInput)) {
				no++;
			}

		}
		if (no == 1) {
			String st = userInput + "'s Contact Present\n1.Call -->" + userInput + "\n2.Text -->" + userInput
					+ "\n3.Exit\n";
			char[] chr = st.toCharArray();
			for (int i = 0; i < chr.length; i++) {
				System.out.print(chr[i]);
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			int userInput2 = scanner.nextInt();
			switch (userInput2) {
			case 1:
				calling(userInput, createQuery);
				break;
			case 2:
				text(userInput, createQuery);
				break;
			case 3:
				exit();
				break;
			default:
				System.out.println("Invalid entry...");
				break;

			}

		}
		if (no != 1) {
			System.out.println("Contect is not Found");
		}

	}

	private static void text(String userInput, Query createQuery) {
		String sql = "select num from Call where name='" + userInput + "'";
		Query createQuery2 = entityManager.createQuery(sql);
		long singleResult = (long) createQuery2.getSingleResult();
		String st6 = "Write Massage\n";
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
		scanner.nextLine();
		String userInput2 = scanner.nextLine();
		String st121 = "press 1 to Send Massage to " + userInput + "\n";
		char[] chr61 = st121.toCharArray();
		for (int i2 = 0; i2 < chr61.length; i2++) {
			System.out.print(chr61[i2]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int userInput3 = scanner.nextInt();
		if (userInput3 == 1) {
			String st31a = "Massage Sending...";
			char[] chr3a = st31a.toCharArray();
			for (int i21a = 0; i21a < chr3a.length; i21a++) {
				System.out.print(chr3a[i21a]);
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Massage \nname : " + userInput + "\nPhone Number :" + singleResult + "\n" + userInput2);
		}
		String st61 = "1.Main Menu\n2.Exit\n";
		char[] chr611 = st61.toCharArray();
		for (int i2 = 0; i2 < chr611.length; i2++) {
			System.out.print(chr611[i2]);
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

	private static void calling(String userInput, Query createQuery) {

		String query = "select num from Call";
		Query createQuery1 = entityManager.createQuery(query);
		java.util.List resultList = createQuery1.getResultList();
		String sql = "select num from Call where name='" + userInput + "'";
		Query createQuery2 = entityManager.createQuery(sql);
		long singleResult = (long) createQuery1.getSingleResult();
		System.out.println("Calling...\n" + userInput + "\n" + singleResult);
		String st61 = "1.Main Menu\n2.Exit\n";
		char[] chr61 = st61.toCharArray();
		for (int i2 = 0; i2 < chr61.length; i2++) {
			System.out.print(chr61[i2]);
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

	private static void exit() {
		String st = "Thankyou....\nI hope you enjoyed\n";
		char[] chr = st.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static void operation() {
		String st = "What operation you want to do\n1.Add Contact\n2.Remove Contact\n3.Update Contact \n4.Exit\n";
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
			addContect();
			break;
		case 2:
			removeContect();
			break;
		case 3:
			update();
			break;
		case 4:
			exit();
			break;
		default:
			System.out.println("Invalid User Input");
			break;

		}

	}

	private static void update() {
		String st = "What operation you want to do\n1.Update By Name \n2.Update By number\n3.Exit\n";
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
			updatebyname();
			break;
		case 2:
			updatebynumber();
			break;
		case 3:
			exit();
			break;

		default:
			System.out.println("Invalid User Input");
			break;
		}
	}

	private static void updatebynumber() {
		basicThing();
		EntityTransaction transaction = null;
		transaction = entityManager.getTransaction();
		transaction.begin();
		System.out.println("Enter the Number");
		long userInput = scanner.nextLong();
		System.out.println("Enter the New Name ");
		scanner.nextLine();
		String userInput1 = scanner.nextLine();
		String query11 = "update Call set name='" + userInput1 + "' where num=" + userInput;
		Query createQuery11 = entityManager.createQuery(query11);
		int resultList11 = createQuery11.executeUpdate();
		if (resultList11 != 0) {
			System.out.println(resultList11 + "row Affected");
			String st6 = "Contact's Updated Sucessfully\nUpdated Contact List : \nAll Contact";
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
			String query1 = "from Call";
			Query createQuery1 = entityManager.createQuery(query1);
			java.util.List resultList1 = createQuery1.getResultList();
			for (Object object : resultList1) {
				System.out.println(object);
			}
		} else {
			System.out.println("Invalid Input");
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

	private static void updatebyname() {
		basicThing();
		EntityTransaction transaction = null;
		transaction = entityManager.getTransaction();
		transaction.begin();
		System.out.println("Enter the  Name ");
		scanner.nextLine();
		String userInput1 = scanner.nextLine();
		System.out.println("Enter the New Number");
		long userInput = scanner.nextLong();

		String query11 = "update Call set num=" + userInput + " where name='" + userInput1 + "'";
		Query createQuery11 = entityManager.createQuery(query11);
		int resultList11 = createQuery11.executeUpdate();  
		if (resultList11 != 0) {
			System.out.println(resultList11 + "row Affected");
			String st6 = "Contact's Updated Sucessfully\nUpdated Contact List : \nAll Contact";
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
			String query1 = "from Call";
			Query createQuery1 = entityManager.createQuery(query1);
			java.util.List resultList1 = createQuery1.getResultList();
			for (Object object : resultList1) {
				System.out.println(object);
			}
		} else {
			System.out.println("Invalid Input");
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

	private static void removeContect() {
		basicThing();
		EntityTransaction transaction = null;
		transaction = entityManager.getTransaction();
		transaction.begin();
		System.out.println("All Contact");
		String query11 = "from Call";
		Query createQuery11 = entityManager.createQuery(query11);
		java.util.List resultList11 = createQuery11.getResultList();
		for (Object object : resultList11) {
			System.out.println(object);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String st = "enter the Contact Name which you want to delete : ";
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
		scanner.nextLine();
		String name1 = scanner.nextLine();

		String query2 = "delete from Call where name='" + name1 + "'";
		Query createQuery = entityManager.createQuery(query2);
		int executeUpdate = createQuery.executeUpdate();
		transaction.commit();
		if (executeUpdate != 0) {
			String st1 = name1 = name1 + "'s" + "Contact Deleted Successfully\nUpdated Contact List : \nAll Contact\n";
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
			String query1 = "from Call";
			Query createQuery1 = entityManager.createQuery(query1);
			java.util.List resultList1 = createQuery1.getResultList();
			for (Object object : resultList1) {
				System.out.println(object);
			}
			String st6 = "1.Remove More Contact List\n2.Main Menu\n3.Exit\n";
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
				removeContect();
			} else if (userInput2 == 2) {
				menu();
			} else if (userInput2 == 3) {
				exit();
			} else {
				System.out.println("Invalid Input");
			}
		}
	}

	private static void addContect() {
		int executeUpdate;

		String st1 = "How much Contact you want to add : ";
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

			String st3 = "Enter the Name : ";
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
			String st4 = "Enter the Contact Number : ";
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
			long sname = scanner.nextLong();
			String st5 = "Enter the Email Address : ";
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
			scanner.nextLine();
			String du = scanner.nextLine();
			basicThing();
			EntityTransaction transaction = null;
			transaction = entityManager.getTransaction();
			transaction.begin();
			Call s = new Call(name, sname, du);
			entityManager.persist(s);
			transaction.commit();
		}
		String st6 = "Contact added Sucessfully\nUpdated Contact List : \nAll Contact";
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
		String query1 = "from Call";
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

	private static void ShowContect() {
		basicThing();
		String st = "All Contect";
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
		String query = "from Call";
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
}
