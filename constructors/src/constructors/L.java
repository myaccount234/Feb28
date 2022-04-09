package constructors;

public class L {
	int i;
	
	void test()
	{
		System.out.println(i);//global variable
		System.out.println(this.i);
		int i = 100;
		System.out.println(i);//local variable 
		System.out.println(this.i);
	}

	  public static void main(String[] args) {
		L obj = new L();
		obj.i = 50;
		obj.test();
		System.out.println("end");
	}
}
