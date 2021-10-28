import java.util.Scanner;
 class CheckPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter any no. ");
		 int n=sc.nextInt();
		 int count=2; 
		 for(int i=2;i<=n/2;i++)
		 {
			
			 if(n%i==0)
				 count++;
		 }
		 if(count==2)
			 System.out.println("Entered number is prime no.");
		 else
			 System.out.println("Entered number is not prime no.");


	}
 }