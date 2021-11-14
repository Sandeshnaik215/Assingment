package Menu1;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiplayer1 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Multiplayer1 multiplayer1=new Multiplayer1();

		String st = "Wellcome to my Playlist\n";
		char[] chr = st.toCharArray();
		for (int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]);
			Thread.sleep(30);
		}
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Maroon");
		arrayList.add("Baby");
		arrayList.add("Vibe");
		arrayList.add("Muat");
		arrayList.add("Machayenge");
		arrayList.add("Tum ho");
		arrayList.add("tere sang");

		multiplayer1.toShowMenu(arrayList);
	}

	 public void toShowMenu(ArrayList<String> arrayList) throws InterruptedException {
		Menu1 manu = new Menu1();
		String st1 = "\n1.Play Song\n2.Search for Song\n3.Operate on MultiPlayer\n4.Exit\n";
		char[] chr1 = st1.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			Thread.sleep(30);
		}
		Scanner sc1 = new Scanner(System.in);
		int userOption = sc1.nextInt();
		switch (userOption) {
		case 1:
			playSong(arrayList);
			break;
		case 2:
			searchSong(arrayList);
			break;
		case 3:
			operateMultiMidia(arrayList);
			break;
		case 4:
			manu.exitApp();
			break;
		default:
			System.out.println("Invalid entry!!");
			break;
		}

	}

	 public void operateMultiMidia(ArrayList<String> arrayList) throws InterruptedException {
		Scanner sc2 = new Scanner(System.in);
		String st1 = "\nWhat you want to do ?\n1.Add New Song\n2.Remove Songs from Playlist\n";
		char[] chr1 = st1.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			Thread.sleep(30);
		}
		int numOfSongsForAddOrRemove = sc2.nextInt();
		switch (numOfSongsForAddOrRemove) {
		case 1:
			AddSong(arrayList);
			break;
		case 2:
			removeSong(arrayList);
			break;
		}

	}

	public void removeSong(ArrayList<String> arrayList) throws InterruptedException {
		Multiplayer1 multiplayer1=new Multiplayer1();
		Menu1 menu = new Menu1();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Which song you want to remove ");
		
		int no1 = 1;
		for (String string : arrayList) {
			System.out.print(no1++ + ".");
			System.out.println(string);
		}

		int numOfSongsForRemove = sc2.nextInt();
		int index = numOfSongsForRemove - 1;
		arrayList.remove(index);
		System.out.println("Song removed Successfully......\nUpdated Playlist");
		int no = 1;
		for (String string : arrayList) {
			System.out.print(no++ + ".");
			System.out.println(string);
		}

		System.out.println("Press 1 for Main Menu\n2  for Exit");
		int userOption = sc2.nextInt();
		if (userOption == 1) {
			toShowMenu(arrayList);
		} else if (userOption == 2) {
			menu.exitApp();
		} else {

			System.out.println("Invalid entry!!");

		}
	}

	public void AddSong(ArrayList<String> arrayList) throws InterruptedException {
		Multiplayer1 multiplayer1=new Multiplayer1();
		Menu1 menu = new Menu1();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("How much song you want to Add ");
		int onOfSongs = sc2.nextInt();
		System.out.println(" Add Songs now ");
		int sizeOfArray = arrayList.size() + 1;
		for (int i = sizeOfArray; i < sizeOfArray + onOfSongs; i++) {
			arrayList.add(sc2.next());
		}
		System.out.println("Song Added Successfully......\nUpdated Playlist");

		int no = 1;
		for (String string : arrayList) {
			System.out.print(no++ + ".");
			System.out.println(string);
		}
		System.out.println("Press 1 for Main Menu\n 2 for Exit");
		int userOption = sc2.nextInt();
		if (userOption == 1) {
			toShowMenu(arrayList);
		} else if (userOption == 2) {
			menu.exitApp();
		} else {
			System.out.println("Invalid entry!!");
		}

	}

	public void searchSong(ArrayList<String> arrayList) throws InterruptedException {
		Multiplayer1 multiplayer1=new Multiplayer1();
		Menu1 menu = new Menu1();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Song Name :");
		String userInput = sc2.next();
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).equalsIgnoreCase(userInput)) {
				System.out.println(arrayList.get(i));
				String searchString = "Now Song is Playing....\n";
				char[] chr = searchString.toCharArray();
				for (int j = 0; j < chr.length; j++) {
					System.out.print(chr[j]);
					Thread.sleep(30);
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
		}
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).equalsIgnoreCase(userInput)) {

			} else {
				System.out.println(
						"Song is not found!!\nyou want to add this song to your playlist?\nif yes.. then press 1\n2 for exit");
				int n = sc2.nextInt();
				switch (n) {
				case 1:
					int sizeOfArray = arrayList.size() + 1;
					for (int k = sizeOfArray; k < sizeOfArray + 1; k++) {
						arrayList.add(userInput);
					}
					System.out.println("Song Added Successfully......\nUpdated Playlist");

					int no = 1;
					for (String string : arrayList) {
						System.out.print(no++ + ".");
						System.out.println(string);
					}
					System.out.println("Press 1 for Main Menu\n 2 for Exit");
					int userOption = sc2.nextInt();
					if (userOption == 1) {
						toShowMenu(arrayList);
					} else if (userOption == 2) {
						menu.exitApp();
					} else {
						System.out.println("Invalid entry!!");
					}
					break;
				case 2:
					menu.exitApp();
					break;

				}

			}
		}
		

	}

	private static void playSong(ArrayList<String> arrayList) throws InterruptedException {
		Menu1 menu = new Menu1();

		String st1 = "\n1.Play all Song\n2.Search a random Song\n3.Play a Particular Song\n";
		char[] chr1 = st1.toCharArray();
		for (int i = 0; i < chr1.length; i++) {
			System.out.print(chr1[i]);
			Thread.sleep(30);
		}
		Scanner sc1 = new Scanner(System.in);
		int userOption = sc1.nextInt();
		switch (userOption) {
		case 1:
			menu.playAllSong(arrayList);
			break;
		case 2:
			menu.PlayRandomSong(arrayList);
			break;
		case 3:
			menu.PlayParticularSong(arrayList);
			break;
		case 4:
			menu.exitApp();
			break;
		default:
			System.out.println("Invalid entry!!");
			break;

		}

	}
}
