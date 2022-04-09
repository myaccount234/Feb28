package files;

public class Q {
	static int i = test1();
	static int j = test2();
	static int test1()
	{
		System.out.println("from test1");
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		System.out.println(i);
		System.out.println(j);
		i = 200;
		j = 400;
		System.out.println(i);
		System.out.println(j);
		System.out.println("main end");
	}
	static int test2()
	{
    System.out.println("from test2");
    return 10;
	}
}
