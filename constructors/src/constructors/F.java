package constructors;

public class F {
	void test()
	{
		System.out.println("from test:" + this);
	}
	public static void main(String[] args) {
		F f1 = new F();
		System.out.println("main1" + f1);
		f1.test();
		System.out.println("---------");
		F f2 = new F();
		System.out.println("main2" + f2);
		f2.test();
		System.out.println("---------");
		}

}// whichever ref. u are using to call a test method same ref acting as THIS.
