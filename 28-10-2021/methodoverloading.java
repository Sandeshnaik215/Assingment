
public class methodoverloading {
	int a,b,d;
	methodoverloading(int a,int b,int d){
		this.a=a;
		this.b=b;
		this.d=d;
	}
	 static int add(int a,int b){
		int c =a+b;
		return c;
	}
	static int add(int a,int b,int d){
		int e =a+b+d;
		return e;
	}
public static void main(String[] args) {
	int method1=add(2,3);
	int method2=add(2,3,4);
	System.out.println(method1);
	System.out.println(method2);

	
}
}
