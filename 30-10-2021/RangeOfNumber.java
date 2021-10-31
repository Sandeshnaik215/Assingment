package techno.java;

/*12.Create a for statement using a range of numbers from 1 to 1000 inclusive
Sum all the numbers that can be divided with both 3 and 5.
for those numbers that met the above conditions, print out the number
break out of the loop once you find 5 numbers that met the above condition
After breaking out of the loop peint the sum of the numbers that met the above conditions.*/
public class RangeOfNumber {
public static void main(String[] args) {
	int sum=0;	
	int fiveSum=0;
	for(int number=1;number<=1000;number++) {

	if(number%3==0 || number%5==0) {
		sum=number+sum;
	}
	

	}
	/*
	 * for(int j=1;j<=1000;j++) { int count=0; if(count<=5) { if(j%3==0 || j%5==0) {
	 * 
	 * fiveSum=j+fiveSum; count++; } }
	 * 
	 * }
	 */
	System.out.println("Sum of the numbers that divided by 3 and 5 :"+sum);
	/*
	 * System.out.println("Sum of first five number that divided by 3 and 5 :"
	 * +fiveSum);
	 */
}
}


