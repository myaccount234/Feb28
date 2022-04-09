public class G {
	
	public static void main(String[] args) {
		int i = 10;
		System.out.println("main begin:" + i);
		test(i++);
		System.out.println("main1" + i);
		test(++i);
		System.out.println("main2" + i);
		test(i++);
		System.out.println("main3:" + i);
		test(++i);
		System.out.println("main4:" + i);
		System.out.println("main end");
		}
	static void test(int i) 
	{
		System.out.println("from test:" + i);
		i= 20;
		i++; //not in use
		++i; //not in use
		
	}

}