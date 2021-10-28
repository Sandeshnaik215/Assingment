import java.util.Scanner;
public class pattern7 {


		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			int k=1;
			for(int j=1;j<=2*k*i-1;j++) {
				System.out.print("* ");
			}
		System.out.println(" ");
		
		}
		}

	

}
