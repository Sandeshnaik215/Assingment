import java.util.Scanner;
 class CheckPerfectN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter any no. ");
		 int n=sc.nextInt();
		 int sum=0,t=n ;
		 for(int i=1;i<=n/2;i++)
		 {
			
			 if(n%i==0)
				 sum=sum+i;
		 }
		 if(sum==t)
			 System.out.println("Entered number is perfect no.");
		 else
			 System.out.println("Entered number is not perfect no.");


	}
 }