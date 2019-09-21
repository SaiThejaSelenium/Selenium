package day1;

public class Varibul {
	
	//Types 3
	//1. Local
	//2. Instance
	//3. Static variables
	
	int name=70;
	
	static String cm="I am CM";
	
	
	public void test()
	{
		//Local Variables
		int a=20;
		String val="Sai";
		System.out.println(a);
		System.out.println(val);
		System.out.println(name);
		System.out.println(cm);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e=30;
		new Varibul().test();
		int s=new Varibul().name;
		System.out.println(s);
		System.out.println(Varibul.cm);
		
		

	}

}
