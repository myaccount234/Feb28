package constructors;

public class X {
	X()
	{
		this(90);
		System.out.println("X()");
		// this(90);// this should always first condition,,and not in method body
	}
	X(int i)
	{
		System.out.println("X(int)");
	}
	void test()
	{
		//this();
		System.out.println("test()");
	}

}
