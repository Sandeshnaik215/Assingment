import java.util.Scanner;
 class LeapYearC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter any no. ");
		 int y=sc.nextInt();
		 String st = (y%4==0 && y%100!=0||y%400==0)?"Leap Year":"Not a Leap Year";
		 	System.out.println(y+" is "+st);

	}
 }