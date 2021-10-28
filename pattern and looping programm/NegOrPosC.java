import java.util.Scanner;
 class NegOrPosC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter any no. ");
		 int n=sc.nextInt();
		 String num = (n>0)?"POsitive":"Negitive";
		 	System.out.println(n+" is "+num);

	}
 }