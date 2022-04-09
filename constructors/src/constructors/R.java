package constructors;

public class R {
	R()
	{
		this(10); //int arg constructor
		System.out.println("R()");
	}
	R(int i)
	{
		 //this(); //method calling statement
		System.out.println("R(int)");
	}
	public static void main(String[] args) {
		R r1 = new R();
		System.out.println("----------");
		R r2 = new R(90);
		System.out.println("----------");
		R r3 = new R();
		System.out.println("----------");
		R r4 = new R(910);
		System.out.println("----------");
		R r5 = new R();
		System.out.println("----------");
		R r6 = new R(190);
		System.out.println("----------");
	}

} // by default only one constructor
