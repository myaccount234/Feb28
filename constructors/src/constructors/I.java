package constructors;

public class I {
	int a;
	void test()
	{
		System.out.println("test" + a);
		a = 500; //this.a=500
	}
	public static void main(String[] args) {
		I obj = new I();
		obj.a = 100;
		System.out.println("main1" + obj.a);
		obj.test();
		System.out.println("main2" + obj.a);
	}

}
