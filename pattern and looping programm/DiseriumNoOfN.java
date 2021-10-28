//WAJPT Print what are the Diserium No. within n
import java.util.Scanner;
class DiseriumNoOfN {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=1;i<=n;i++) {
			boolean P=isDiseriumNo(i);
			if(P==true)
				System.out.println(i+" ");
				
			
		}
	}
	static boolean isDiseriumNo(int x)
	{ 
		int sum=0,t=x;
		int dc=countDigits(x); 
		do {
				int r = x%10;
				sum=sum+pow(r,dc);
				dc--;
				x=x/10;
			}while(x!=0);
		return sum==t;
		}
	static int countDigits(int a)
	{
		int count=0;
		do {
			count++;
			a=a/10;
		}while(a!=0);
		return count;
	}
	static int pow(int n, int p)
	{
		int pw=1;
				while(p>0) {
					pw=pw*n;
					p--;
				}
		return pw;
	}
			
	}