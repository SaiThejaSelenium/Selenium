package day1;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tej="Hello World";
		//length
		int len=tej.length()-1;
		System.out.println(len);
		
		//char c=tej.charAt(10);
		//System.out.println(c);
//		String rev="";
//		for(int i=len;i>=0;i--) {
//			
//			System.out.println(tej.charAt(i));
//			char d=tej.charAt(i);
//			 rev=rev+d;
//		}
//		System.out.println(tej);
//		System.out.println(rev);
//		if(tej.equals(rev)) {
//			
//			System.out.println();
//		}else {
//			
//		}
		
		boolean status=tej.equals("HELLO");
		System.out.println(status);
		
		status=tej.equalsIgnoreCase("HELLO");
		System.out.println();
		status =tej.contains("Hello");
		System.out.println(status);
		
		int s=tej.lastIndexOf('l');
		System.out.println(s);
		
		int d=tej.indexOf("Hello");
		
		System.out.println(d);
		
		tej=tej.replaceAll("Hello", "Chennai");
		System.out.println(tej);
		tej=tej.concat(" Hyderabad");
		System.out.println(tej);
		String[] spl=tej.split(" ");
		System.out.println(spl.length);
		
		System.out.println(spl[1]+" "+spl[2]);
		
		
		

	}

}
