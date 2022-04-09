package constructors;

public class N {
	int i;
	void test(int i)
	{
		System.out.println(this.i);
		System.out.println(i);
		this.i = 2000;
	}
	public static void main(String[] args) {
		N n1 = new N();
		n1.i = 100;
		System.out.println("main1:" + n1.i);
		n1.test(500);
		System.out.println("main2:" + n1.i);
		n1.i = 300;
		n1.test(400);
		System.out.println("main3:" + n1.i);
		
	}

}
