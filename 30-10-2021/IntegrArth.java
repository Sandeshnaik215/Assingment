package techno.java;
import java.util.Scanner;
/*6.Take 20 integer inputs from user and print the following:
	number of positive numbers
	number of negative numbers
	number of odd numbers
	number of even numbers
	number of 0s*/
public class IntegrArth {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("How many number you going to enter :");
		 int n=sc.nextInt();
		 int[] array=new int[n];
		 for(int i=0;i<n;i++) {
		 array[i]=sc.nextInt();
		 }
		
		 int totalPositiveNumber=0;
		 int totalNegativeNumber=0;
		 int totalEvenNumber=0;
		 int totalOddNumber=0;
		 int totalZeros=0;
		 for (int j=0;j<n;j++) {
		 if(array[j]>=0) {
			 totalPositiveNumber++;
		 }
		 if(array[j]<0) {
			 totalNegativeNumber++;
		 }

		 if(array[j]%2==1) {
			 totalOddNumber++; 
		 }
		 if(array[j]%2==0) {
			 totalEvenNumber++; 
		 }
		 if(array[j]==0) {
			 totalZeros++; 	 
		 }
		 }
		 System.out.println("Total Positive Number :"+totalPositiveNumber);
		 System.out.println("Total Negative Number :"+totalNegativeNumber);
		 System.out.println("Total Odd Number :"+totalOddNumber);
		 System.out.println("Total Even Number :"+totalEvenNumber);
		 System.out.println("Total Zero's :"+totalZeros); 

	}
}
