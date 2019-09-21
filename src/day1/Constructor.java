package day1;

public class Constructor {
	int a;

	// instance blocks
	{
		System.out.println("I am in stance blocks -1");

	}

	public Constructor() {
		this(10, 10);
		System.out.println("I am 0 org constructor");

	}

	public Constructor(int a, int b) {
		// this();
		System.out.println(a);
		System.out.println(this.a);
		this.a = a;

		System.out.println("I am  parameter constructor");
	}

	public Constructor(int t, int b, int x) {
		// this();

		System.out.println("I am  parameter constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructor(10, 10);
		// new Constructor(10,10);
//		new Constructor();
//		new Constructor();
		System.out.println(new Constructor().a);

	}

	// instance blocks
	{
		System.out.println("I am in stance blocks -2");

	}
	// static blocks
	static {
		System.out.println("I am static block");

	}
	static {
		System.out.println("I am static block 2");

	}
	static {
		System.out.println("I am static block 3");

	}
}
