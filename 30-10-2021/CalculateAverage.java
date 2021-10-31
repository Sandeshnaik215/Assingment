package techno.java;
import java.util.Scanner;

//3.Calculate the average of 20, 30, 25, 35, -16, 60, -100 using Arrays
public class CalculateAverage {
	public static void main(String[] args) {
	CalculateAverage average= new CalculateAverage();
	 Scanner sc= new Scanner(System.in);
	 System.out.println("How many number you going to enter :");
	 int n=sc.nextInt();
	 double[] array=new double[n];
	 for(int i=0;i<n;i++) {
	 array[i]=sc.nextInt();
	 }
	 double sum=0;
	for(int j=0;j<n;j++){
		sum=array[j]+sum;
		
	}
	double avg=sum/n;
	System.out.println(avg);
	System.out.println(sum);
		
	
	}
}
