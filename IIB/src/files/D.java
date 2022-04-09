package files;

public class D {
	static int i;
	{
		System.out.println("D():" + i );
	}
	{
		System.out.println("IIB" + i);
	}
	
	static void test()
	{
		i = 200;
	}
	public static void main(String[] args) {
		D d1 = new D();
		System.out.println(d1.i); //D.i
	}

}
