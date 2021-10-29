import java.util.Scanner;
public class Servant {
   static int moneyto;
  int product;
	public Servant(int moneyto) {
		this.moneyto=moneyto; 
		System.out.println("what you want you buy?if ,yes write the name of the product\n 1.mobile\n 2.laptop\n 3.cloth");
		Scanner scan=new Scanner(System.in);
		String shop=scan.next();
		int rMoney=0;
		int rMoney2=0;
		int rMoney3=0;
		 rMoney=mobilePhone(product); 
		System.out.println("remaining Balence :"+rMoney);
		
	}
	 static int mobilePhone(int product) {
			System.out.println("Enter the product Price");
			Scanner scan=new Scanner(System.in);
			int price =scan.nextInt();
		 int remainMoney=moneyto-price;
		 return remainMoney;
	 }

		/*
		 * static int laptop(String laptop) {
		 * System.out.println("Enter the laptop Price"); Scanner scan=new
		 * Scanner(System.in); int price =scan.nextInt(); int remainMoney=moneyto-price;
		 * return remainMoney; } static int cloth(String cloth) {
		 * System.out.println("Enter the cloth Price"); Scanner scan=new
		 * Scanner(System.in); int price =scan.nextInt(); int remainMoney=moneyto-price;
		 * return remainMoney;
		 */

	void shopping(int money) {
		System.out.println("what you want you buy?  mobile(if ,yes write mobile)");
		Scanner scan=new Scanner(System.in);
		String shop=scan.next();
		int rMoney=mobilePhone(product);
		System.out.println("remaining Balence :"+rMoney);

		
	}

}
