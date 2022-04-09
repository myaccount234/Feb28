
public class F {
	
	public static void main(String[] args) {
		int i = 10;
		System.out.println("main begin:" + i);
		test(i);
		i = 300;
		System.out.println("main end:" + i);
		}
	static void test(int i) //this argument. local to main method
	{
		System.out.println("from test:" + i);
		i= 20;
	}

}

//same name different scope