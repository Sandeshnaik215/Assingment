import java.util.Scanner;
class PerNo
{
	static boolean isPerNo(int x){
		int sum=1;
		for(int i=1;i<=x/2;i++)
			if(x%i==0)
				sum=sum*i;
			if(x==sum)
				return true;
			else 
				return false;
		
	}	
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	boolean p=isPerNo(n);
		if(p==true)
			System.out.println("entered no. is Perfect number");
		else
			System.out.println("enteredno. is not Perfet number");
}
}