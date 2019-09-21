package day1;

public class Loopings {

	public static void forloop() {

		// for(intial value;conditional value;increment/decrement){ }

		int a;
		int b = 10;

		for (a = 1; a <= b;) {
			System.out.println(a);
			a = a + 2;

		}

	}

	public static void whileloop() {
		/**
		 * while (condition) {
		 * 
		 * 
		 * 
		 * increment/decrement }
		 **/
		
		int a=100;
		int c=1;
		while(a>=c) {
			System.out.print(a+",");
			
			if(a==50) {
				break;
			}
			
			a--;
		}
		

	}
	public static void dowhile() {
		/**
		do {
			
			
			increment or decrement
		}while(condition);
		
		**/
		
		int a=100;
		int b=1;
//		do {
//			System.out.println(a);
//			
//			a--;
//		}while(a<=b);
		
		
		boolean status=true;
		do {
			System.out.println(a);
			
			a--;
			status=a>=b;
			
		}while(status);
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//forloop();
		whileloop();
		//dowhile();
	}

}
