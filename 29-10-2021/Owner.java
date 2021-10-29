import java.util.Scanner;

public class Owner extends Servant {
int money;
	
	  public Owner(int money) {
		 
		  super(money);
	  }
	 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the money you want :");
		int money = sc.nextInt();
		Owner o= new Owner(money);

	}

}