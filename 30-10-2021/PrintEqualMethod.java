package techno.java;

import java.util.Scanner;

/*9.Write a method printEqual with 3 parameters of type int. The method should not return anything ( void). 
		 If one of the parameters is less than 0, print text "Invalid Value". 
		 If all numbers are equal print text "All numbers are equal" 
		 If all numbers are equal print text "All numbers are equal" 
		 If all numbers are different print text "All numbers are different". 
		 Otherwise, print "Neither all are equal or different".*/ 
public class PrintEqualMethod {
	public void printEqual(int FirstInt,int SecondInt,int ThirdInt) {
		if(FirstInt==SecondInt && FirstInt==ThirdInt) {
			System.out.println("All numbers are equal");
		}
		else if(FirstInt<0 ||SecondInt<0 ||ThirdInt<0) {
			System.out.println("Invalid Value");
		}
		else if(FirstInt!=SecondInt && FirstInt!=ThirdInt) {
			System.out.println("All numbers are different");
		}
		else{
			System.out.println("Neither all are equal or different");
		}	
	}
	public static void main(String[] args) {
		PrintEqualMethod equalMethod=new PrintEqualMethod();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr 3 Integer value :");
		int FirstInt=sc.nextInt();
		int SecondInt=sc.nextInt();
		int thirdInt=sc.nextInt();
		equalMethod.printEqual(FirstInt,SecondInt,thirdInt);

	}
}
