package oops;

public class OverRidingClass extends OverLoading{
	
	public OverRidingClass(int a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	public static void test() {
		
		System.out.println("I am child class");
	}
	
	public static void test(int a) {
		
		
		
	}
	public void test(int a,int b) {
		
		System.out.println("I am test  child a and b parameter");
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new OverLoading().test(10, 20);
		//new OverRidingClass().test(20, 52);
		
	//	parentclassname obj=new ChildClassName()
		
		OverLoading obj=new OverRidingClass(10);
		new OverRidingClass(20).test();
		obj.test(10, 20);

	}

}
