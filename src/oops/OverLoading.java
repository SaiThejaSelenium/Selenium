package oops;

public class OverLoading {
	
//	public OverLoading() {
//		System.out.println("I am 0org");
//		
//	}
	static int a;
	public OverLoading(int a) {
		System.out.println("I am org " + a);
		
		OverLoading.a=a;
		
	}

	public static void test() {
		System.out.println("I am test method");
		

	}

	public static void test(int a) {
		System.out.println("I am test a parameter");
		test();

	}

	public void test(int a,int b) {
		
		System.out.println("I am test  parent a and b parameter");
		test(25);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new OverLoading().test(10,52);
		
		//OverLoading name= new OverLoading(10);
		
		//test(25);
		
		OverLoading.test();
		
		OverLoading old= new OverLoading(10);
		old.test(10,20);
		
		//System.out.println(name);

	}

}
