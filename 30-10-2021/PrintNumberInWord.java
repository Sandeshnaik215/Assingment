package techno.java;

import java.util.Scanner;

/*11.Write a method called printNumberInWord.The method has one parameter number which is the whole number. 
The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 
0, 1, 2, .... 9 or otherfor any other number including negative numbers. 
You can use if-else statement or switch statement whatever is easier for you.*/
public class PrintNumberInWord {
	public static String printNumberInWord(int number){
		String numberInWord;
		switch(number){
		case 0: numberInWord="Zero"; break;
		case 1: numberInWord="One"; break;
		case 2: numberInWord="Two"; break;
		case 3: numberInWord="Three"; break;
		case 4: numberInWord="Four"; break;
		case 5: numberInWord="Five"; break;
		case 6: numberInWord="Six"; break;
		case 7: numberInWord="Seven"; break;
		case 8: numberInWord="Eight"; break;
		case 9: numberInWord="Nine"; break;
		default : numberInWord="Other"; break;
		}
		return numberInWord;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number :");
		int number=sc.nextInt();
		String numberInWord=printNumberInWord(number);
		System.out.println("Entered Number is :"+numberInWord);
	}
}
