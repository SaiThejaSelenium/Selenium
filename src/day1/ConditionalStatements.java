package day1;

public class ConditionalStatements {

	public static void ifcondition() {
		/**
		 * 
		 * if(condition) {
		 * 
		 * //operation }
		 **/

		int s = 46;
		int d = 46;

		if (s == d) {
			System.out.println(" s and d values are equal");
		}
		System.out.println("Hello");

	}

	public static void ifelsecondition() {
		/**
		 * 
		 * if(condition) {
		 * 
		 * true condition operation
		 * 
		 * }else {
		 * 
		 * false condition operation
		 * 
		 * }
		 * 
		 **/

		int a = 30;
		int b = 30;
		boolean s = a == b;
		if (s) {
			System.out.println(" a and b are equal");

		} else {

			System.out.println("a and b are not equal");
		}

	}

	public static void ifelseifcondition() {
		/**
		 * 
		 * if (condition) {
		 * 
		 * 
		 * } else if (condition) {
		 * 
		 * 
		 * } else if (condition) {
		 * 
		 * 
		 * } else {
		 * 
		 * }
		 * 
		 **/

		String browser = "Opera";

		if (browser.equals("Chrome")) {

			System.out.println("Launching Chrome");
		} else if (browser.equals("FF")) {

			System.out.println("Launching firefox");
		} else if (browser.equals("IE")) {
			System.out.println("Launching IE");
		} else {

			System.out.println("Please enter valid browser");
		}

	}

	public static void switchCondition() {

		/**
		 * 
		 * switch (condition) {
		 * 
		 * case "":
		 * 
		 * break; case "":
		 * 
		 * break; case "":
		 * 
		 * break;
		 * 
		 * default:
		 * 
		 * break;
		 * 
		 * }
		 * 
		 **/

		String browser = "IE";
		switch (browser) {

		case "Chrome":
			System.out.println("Launch Chrome");
			break;

		case "FF":
			System.out.println("Firefox launch");
			break;

		case "IE":
			System.out.println("IE launch");
			break;
		default:

			System.out.println("Enter valid input");
			break;

		}

	}

	public static void nestedIf() {
		/**
		 * 
		 * if(condition) {
		 * 
		 * if(condition) {
		 * 
		 * 
		 * }
		 * 
		 * }
		 * 
		 **/

		String bikestart = "ON";
		if (bikestart.equals("ON")) {

			String start = "Kick";

			if (start.equals("Self")) {

				System.out.println("Bike Self");
			} else {

				System.out.println("Bike kick");
			}

		} else {

			System.out.println("Bike off condition");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ifcondition();

		// ifelsecondition();

		// ifelseifcondition();
		switchCondition();
		//nestedIf();

	}

}
