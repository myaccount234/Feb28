package app3;

public class M8 {
	
	public static void main(String[] args) {
		System.out.println("main begin");
		test();
		System.out.println("--------");
		test();
		System.out.println("--------");
		test();
		System.out.println("--------");
		test();
		System.out.println("--------");
		method();
		System.out.println("main end");
		
} // main method always public
static void test()
{
	System.out.println("from test");
	System.out.println("from test");
	System.out.println("from test");
}

static void method()
{
	System.out.println("method begin");
	test(); //any method call within any method
	System.out.println("method end");
	
}


} //once u define the method u can call this method from any method not necccessary to call in only main methood
