
public class Z {
	int i; 
	static void test (Z arg)
	{
    System.out.println("test" + arg.i);
    arg.i +=10;
    }
	
	public static void main(String[] args) {
		Z z1 = new Z();
		z1.i = 20;
		System.out.println("main:" + z1.i);
		test(z1);
		System.out.println("main2:" + z1.i);
	}
}
