
class M5{
	static int i = test();
	static
	{
		System.out.println("A1-test");
	}
	    static int test()
	
	{
		System.out.println("from test");
		return 100;
	}
}
public class W {
	static int j = 200;
	static
	{
		System.out.println("W-SIB");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		System.out.println(M5.i);
		M5.i = 400;
		System.out.println(M5.i);
		M5.i = 300;
		System.out.println(M5.i);
		M5.test();
		System.out.println("main end");
		} }

//CHECKK CLASS NAME // CHECK THIS PROGRAM IN EDITPLUS
