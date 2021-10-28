//WAJPT Print what are the Happy No. within 100

class HappyNoWithinN {
	public static void main(String[] args) {

		for(int i=1;i<=100;i++) {
			boolean P=isHappyNo(i);
			if(P==true)
				System.out.println(i+" ");
				
			
		}
	}
	static boolean isHappyNo(int x)
	{
		while (x>9)
		{	
		int sum=0;
		do {
				int r = x%10;
				sum=sum+r*r;
				x=x/10;
			}while(x!=0);
		x=sum;
		}	
		return x==1||x==7;
		}
		
			
	}


