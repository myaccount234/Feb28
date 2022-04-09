package app3;

public class M9 {
	public static void main(String[] args)
	{
		System.out.println("main1");
		test1();
		System.out.println("main2");
		test2();
	}
	static void test1(){
		System.out.println("test1 begin");
		test2();
		System.out.println("test1 end");
	}
	
	static void test2(){
		System.out.println("from test2");
		}

}
