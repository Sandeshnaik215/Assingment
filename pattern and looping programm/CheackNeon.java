import java.util.Scanner;
 class CheackNeon {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter any no. ");
		 int n=sc.nextInt();
		 int sq=n*n;
		 int sum=0;
		 while(sq!=0)
		 {
			 int r = sq%10;
			 sum=sum+r;
			 sq=sq/10;
		 }
		 if(sum==n) {
			 System.out.println("Entered no. is Neon No. ");
		 }
		 else
			 System.out.println("Entered no. is not Neon No. ");
	}
 }