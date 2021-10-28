import java.util.Scanner;
 class FactorsForN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter any no. ");
		 int n=sc.nextInt();
		 int count=0;
		 for (int i=1;i<=n;i++)
		 {
			if(n%i==0)
				count++;
		 }
	System.out.println("factors for "+n+" is "+count);
	}
 }