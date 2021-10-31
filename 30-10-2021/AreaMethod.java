package techno.java;

import java.util.Scanner;

/*10.Write a method named area with one double parameter named radius. 
The method needs to return a double value that represents the area of a circle.
If the parameter radius is negative then return -1.0 to represent an invalid value.
Write another overloaded method with 2
parameters x and y (both doubles), where x and y represent the sides of a rectangle.
The method needs to return an area of a rectangle.If either or both parameters is/are a negative return -1.0 
to indicate an invalid value.*/
public class AreaMethod {
	final double pi=3.142;

	public double area(double redius) {
		 double areaOfCircle1=0;
		 
		if(redius>0) {
			areaOfCircle1=pi*redius*redius;
		}
		else if(redius<=0) {
			areaOfCircle1=-1.0;
		}	
		return areaOfCircle1;	
	}
	public double area(double length,double width) {
		 double areaOfRectAngle1=0;
		if(length>0 && width>0) {
			areaOfRectAngle1=length*width;
		}
		else if(length<=0||width<=0) {
			areaOfRectAngle1=-1.0;
		}	
		return areaOfRectAngle1;
	}	
	
public static void main(String[] args) {
	AreaMethod areaMethod=new AreaMethod();
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter 1 (If you want to Find the area of the circle)\n Enter 2 (If you want to Find the area of the rectangle)");
	int which=sc.nextInt();
	double redius;
	double length;
	double width;
	 double areaOfCircle=0;
	 double areaOfRectAngle=0;

	  if(which==1) {
		 System.out.println("Enetr the redius of the Circle");
	  	 redius=sc.nextDouble();
	  	 areaOfCircle=areaMethod.area(redius);
	  } else if(which==2) {
		 System.out.println("Enetr the Length of the rectangle");
		 length = sc.nextDouble();
		 System.out.println("Enetr the Width of the rectangle");
		 width=sc.nextDouble();
		 areaOfRectAngle=areaMethod.area(length,width);
	  } else { System.out.println("Invalid Entry"); }
	  if(which==1) {
		  System.out.println("Area of the Circle :"+areaOfCircle);
	  }
	  else if (which==2) {
		  System.out.println("Area of the Rectangle :"+areaOfRectAngle); 
	  }
	 
	 
}
}
