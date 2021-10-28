import java.util.Scanner;
 class FactorialOfN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter any no. ");
		 int n=sc.nextInt();
		 int sum=1;
		 for(int i=n;i>0;i--)
		 { 
			 sum=sum*i ;
		 }
		 	 
		 	System.out.println(sum);

	}
 }