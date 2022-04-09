package files;

public class M {
	static int i;
	public static void main(String[] args) {
		System.out.println("main1" + i);
		i = 20;
		test();
		System.out.println("main2:" + i);
	}
	static void test()
	{
		System.out.println("test" + i);
		i += 40; //i=20,, i+=40 means i=i+40,it will added both
	}

}
