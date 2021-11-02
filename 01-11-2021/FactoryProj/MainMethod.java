package techno.java.corejava.abstraction.FactoryProj;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) {
		FactoryClass fact=new FactoryClass();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter\n 1.Comedy\n 2.Dancer\n 3.Project Maneger\n 4.Sleepy Guy");
		int number=sc.nextInt();
		switch(number) {
		
		case 1: fact.getType("Comedy").type(); break;
		case 2: fact.getType("Dancer").type(); break;
		case 3: fact.getType("Project Maneger").type(); break;
		case 4: fact.getType("Sleepy").type(); break;
		default : System.out.println("Invalid "); break;
		}

}
}
