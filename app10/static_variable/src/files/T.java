package files;

public class T {
	static
	{
		System.out.println("SIB1"); //it is also initializer
	}
	
	static int i = test();
	
	public static void main(String[] args)
	{
		System.out.println("from main:" + i + "," + j);
	}
	
	static int test()
	{
		System.out.println("from test"); //,this will print after SIB coz SOP van excecuted for any method firstl it called by.
		return 200;
	}
	
	static
	{
		System.out.println("SIB2"); //it is also initializer,
	}
	static int j = test();

}// total four initializers
