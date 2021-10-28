//WAJPT Print what are the Amstrong No. within 10000

class AmstrongNo {
	public static void main(String[] args) {

		for(int i=1;i<=10000;i++) {
			boolean P=isAmstrongNo(i);
			if(P==true)
				System.out.println(i+" ");
				
			
		}
	}
	static boolean isAmstrongNo(int x)
	{
		
		int sum=0,t=x;
		int dc=countDigits(x);
		do {
				int r = x%10;
				sum=sum+pow(r,dc);
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