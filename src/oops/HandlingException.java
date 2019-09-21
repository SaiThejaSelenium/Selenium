package oops;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class HandlingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 10;
			Thread.sleep(500);
			System.out.println(a);
			int b = 0;
			System.out.println(b);
			int c = a / b;
			System.out.println(c);
			//FileInputStream is = new FileInputStream(f);
		} catch (Exception e) {
			System.out.println(e);
			throw new ArithmeticException("Not division by 0");
		} finally {
			System.out.println("I am finally block");
		}

		System.out.println("Hello");

		System.out.println("I am handling block");

	}

}
