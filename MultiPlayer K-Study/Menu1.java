package Menu1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu1 {

	public void playAllSong(ArrayList<String> arrayList) throws InterruptedException {
		Menu1 menu=new Menu1();
		Multiplayer1 multiplayer1=new Multiplayer1();
		Scanner sc2=new Scanner(System.in);

		String st1 = "Now All Song is Play one by one..........\n";
		char[] chr1 = st1.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			Thread.sleep(60);

		}

		for (String string : arrayList) {

			System.out.println(string);

			Thread.sleep(1000);
			String str="Song is Playing......\n";
			char[] chr = str.toCharArray();
			for (int j = 0; j < chr.length; j++) {
				System.out.print(chr[j]);
				Thread.sleep(50);
			}
		}
		System.out.println("Press 1 for Main Menu\n 2 for Exit");
		int userOption = sc2.nextInt();
		if (userOption == 1) {
			multiplayer1.toShowMenu(arrayList);
		} else if (userOption == 2) {
			menu.exitApp();
		} else {
			System.out.println("Invalid entry!!");
		}
	}

	public void searchSong(ArrayList<String> arrayList) throws InterruptedException {
		String st1 = "Enter the song Name\n";
		char[] chr1 = st1.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			Thread.sleep(30);
		}
		Scanner sc1 = new Scanner(System.in);
		String userOption = sc1.next();
		for(int j=0;j<arrayList.size();j++) {
			if(userOption.equalsIgnoreCase(arrayList.get(j))) {
				System.out.println(arrayList.get(j));
			}
		}

	}

	public void PlayRandomSong(ArrayList<String> arrayList) throws InterruptedException {
		Menu1 menu=new Menu1();
		Multiplayer1 multiplayer1=new Multiplayer1();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Playing a random Song... ");
		int indexno = (int) (Math.random() * (arrayList.size() - 1));
		System.out.println(arrayList.get(indexno));
		System.out.println("Press 1 for Main Menu\n 2 for Exit");
		int userOption = sc2.nextInt();
		if (userOption == 1) {
			multiplayer1.toShowMenu(arrayList);
		} else if (userOption == 2) {
			menu.exitApp();
		} else {
			System.out.println("Invalid entry!!");
		}
	}

	public void PlayParticularSong(ArrayList<String> arrayList) throws InterruptedException {
		Menu1 menu=new Menu1();
		Multiplayer1 multiplayer1=new Multiplayer1();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Which song you want to Play ");
		int no1 = 1;
		for (String string : arrayList) {
			System.out.print(no1++ + ".");
			System.out.println(string);
		}
		int userInput = sc2.nextInt();
		for (int i = 1; i <= arrayList.size(); i++) {

			if (i == userInput) {
				System.out.println(arrayList.get(i - 1));
			}
		}
		String searchString = "Now Song is Playing....\n";
		char[] chr = searchString.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]);
			Thread.sleep(30);
		}
		System.out.println("Press 1 for Main Menu\n 2 for Exit");
		int userOption = sc2.nextInt();
		if (userOption == 1) {
			multiplayer1.toShowMenu(arrayList);
		} else if (userOption == 2) {
			menu.exitApp();
			return;
		} else {
			System.out.println("Invalid entry!!");
		}
		System.out.println("Press 1 for Main Menu\n 2 for Exit");
		int userOption1 = sc2.nextInt();
		if (userOption1 == 1) {
			multiplayer1.toShowMenu(arrayList);
		} else if (userOption1 == 2) {
			menu.exitApp();
		} else {
			System.out.println("Invalid entry!!");
		}

	}

	public void exitApp() {
		String str="Thankyou.....\nI hope you enjoyed......";
		char[] chr = str.toCharArray();
		for (int j = 0; j < chr.length; j++) {
			System.out.print(chr[j]);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}



}
