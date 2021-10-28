import java.util.Scanner;
 class BiggestAmongThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter any three no. ");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
		 if(a>b||a>c)
			 System.out.println("biggest no is "+a);
		 else if(b>c)
			 System.out.println( "biggest no is"+b);
		 else
			 System.out.println("biggest no. is "+c);

	}
 }
 /*
 or
 int big=(x>y && x>z)?x:(y>z)?y:z;
 
  System.out.println("biggest no. is "+big);
  
 */