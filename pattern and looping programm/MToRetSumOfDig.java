
import java.util.Scanner;
class MToRetSumOfDig {
	static int SumIs (int x) {
		int sum = 0;
		do {
			int r=x%10;
			sum = sum + r;
			x=x/10;
		}while(x!=0);
	return sum;
	
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr any no.");
		int n=sc.nextInt();
		int S=SumIs(n);
		System.out.println("Sum Of two digit is :"+S);
	}
}
