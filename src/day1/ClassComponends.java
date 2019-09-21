package day1;

public class ClassComponends {

	public void m1() {
		System.out.println("I am instance method");
		// m2();

	}

	public static void m2() {
		System.out.println("I am static method");
		new ClassComponends().m1();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ClassName refVar=new ClassName();
		// Syntax

		// Named Object
		ClassComponends comp = new ClassComponends();
		comp.m1();

		// nameless Object

		new ClassComponends();

		ClassComponends.m2();

	}

}
