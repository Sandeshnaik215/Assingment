import java.util.Scanner;
 class CheckPelindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter any no. ");
		 int n=sc.nextInt();
		 int t=n; 
		  
		 int rs=0;
		 do {
			 int r=n%10;
			 rs=rs*10+r;
			 n=n/10;
		 }while(n!=0);
		 if(rs==t)
			 
		 	System.out.println("pelindrome");
		 else
			 System.out.println("not pelindrome");

	}
 }