
/* public class E {
	int i;
	void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) {
		E e1 = new E();
		System.out.println(e1.i);
		e1.test();
		e1.i = 200;
		System.out.println(e1.i);
		e1.test();
		System.out.println(e1.i);
		e1.test();
		e1.i = 500;
		System.out.println(e1.i);
		e1.test();
		
	}
} //non static member are consider ass object member. */

public class E{
	int i;
	void test()
	{
		System.out.println("test 13");
	}
	public static void main(String[] args) {
		E e1 = new E();
		System.out.println(e1.i);
		e1.test();
		e1.i = 25;
		System.out.println(e1.i);
		e1.test();
		e1.i = 50;
		System.out.println(e1.i);
		e1.test();
		
		
		
	}
	
}