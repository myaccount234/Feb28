package files;

public class R {
	static int i = test1();
	static int j = test2();
	static int test1()
	{
		System.out.println("from test1:" + i + "," + j);
		i += 1;
		j += 2;
		return i + j + 10; // i value return 13 
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
		System.out.println("from test2:" + i + "," + j); // i is 13 now and j value has 2 assigned in test1 method
		i += 3;
		j += 4;
		return i + j + 20; // j return 42
	}
}