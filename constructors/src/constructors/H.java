package constructors;

public class H {
	int i;
	void test()
	{
		System.out.println("test" + this.i);
		this.i = 200;
	}
	public static void main(String[] args) {
		H h1 = new H();
		h1.i = 50;
		System.out.println("main1" + h1.i);
		h1.test();
		System.out.println("main2:" + h1.i );
	}

}
