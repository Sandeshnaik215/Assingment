import java.util.Scanner;
 class EvenOrOddC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter any no. ");
		 int n=sc.nextInt();
		 String st = (n%2==0)?"Even":"Odd";
		 	System.out.println(n+" is "+st);

	}
 }