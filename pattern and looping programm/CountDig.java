import java.util.Scanner;
 class CountDig {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter any no. ");
		 int n=sc.nextInt();
		 int count=0;
		 do {
			 count++;
			n= n/10;
		 }while(n!=0);
		 	System.out.println(count);

	}
 }