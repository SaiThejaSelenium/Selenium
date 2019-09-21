package oops;

import interfacePkg.MotoMobile;

public class ChildClass extends ParentClass{
	
	public void m4() {
		
		System.out.println("child m4 method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c=new ChildClass();
//		ChildClass.m1();
//		c.m2();
//		c.m3();
		c.m4();
		ChildClass.test();
		ParentClass.test();
		test();

		
	}

}
