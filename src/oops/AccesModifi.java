package oops;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AccesModifi {
	
	
	public static String city="Chennai";
	
	public static void test()
	{
		System.out.println("I am public method");
	}
	
	private static String office="OTP";
	
	private static void demo() {
		System.out.println("I am demo private method");
	}
	
	protected String dist="Nellore";
	
	protected static void m1() {
		
		
		System.out.println("Iam m1 protected method");
	}
	
	
	String post="UTKR";
	static  void selenium() throws InterruptedException, FileNotFoundException{
		
		Thread.sleep(5000);
		System.out.println("I am selenium default method");
		File f=new File("");
		FileInputStream is=new FileInputStream(f);
		
	}

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		demo();
		System.out.println(office);
		selenium();
	}

}
