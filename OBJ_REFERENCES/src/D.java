
public class D {
	int i ;
	int test()
	{
		System.out.println("from test");
		return 20;
	}
	public static void main(String[] args) {
		D d1 = new D(); // creating an object with new(always)
		System.out.println("d1.i");
		d1.test();
	
		
	}
}
//d1 is object