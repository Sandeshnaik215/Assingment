import java.util.Scanner;
class AreaNCir {
	static double areaIs(int x) {
	double a = 3.142*x*x;
	return a;
	}
	static double cirIs(int y){
	double c = 3.142*2*y;
	return c;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle :");
		int r=sc.nextInt();
		double area = areaIs(r);
		double cir = cirIs(r);
		System.out.println("area of the circle is :"+area);
		System.out.println("circumarance of circle is :"+ cir);
	}
	 

	}

