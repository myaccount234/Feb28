package files;

public class O {
	static int i = test();
	static int j = test();
	static int test()
	{
		
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
	

	
}