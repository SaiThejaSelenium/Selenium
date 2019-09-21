package day1;

public class ReturnTypeMethods {
	
	public int addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
	public static int subs() {
		int a=20;
		int c=30;
		int d=a-c;
		return d;
		
	}
	public static int parameters(int a,int b) {
		int mul=a*b;
		return mul;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int add=new ReturnTypeMethods().addition();
		int subb=ReturnTypeMethods.subs();
		int mu=parameters(25, 67);
		System.out.println(mu);
		
		int mul=add*subb;
		System.out.println(mul);
		
		System.out.println(add);
		System.out.println(subb);

	}

}
