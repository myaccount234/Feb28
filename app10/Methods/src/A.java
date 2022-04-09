
public class A {
	public static void main(String[] args)
	{
		System.out.println("main begin");
		//test();
		test(10);
       //test (true);	
		
    System.out.println("main end:" + i); //i not initialised
}
	static void test(int i)
	{
		System.out.println("from test:" + i);
	}
	}
 //output--error  i not initialised