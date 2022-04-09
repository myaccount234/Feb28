
/* public class L {
	int i;
	
	static L test()
	{
		L obj = new L();
		obj.i = 10;
		System.out.println("test:" + obj.i);
		return obj;
		
	}
	public static void main(String[] args) {
		L ref = test();
		System.out.println("main" + ref.i);
	}

} */

 
public class L{
	int i;
	static L test()
	{
		L obj = new L();
		obj.i = 20;
		System.out.println("test:" + obj.i);
		return obj;
		
	}
	public static void main(String[] args) {
		L ref = test();
		System.out.println("main" + ref.i);
		
	}
	
}