package files;

public class S {
	static
	{
		System.out.println("SIB");
	}
	static int i = test();
	
	public static void main(String[] args)
	{
		System.out.println("from main:" + i);
		
	}
	static int test()
	{
		System.out.println("from test"); //this will print after SIB coz SOP van excecuted for any method firstl it called by.
		return 200;
	}

}
