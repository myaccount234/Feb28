package constructors;

public class C {
	int i;
	C()
	{
		i = 10;
	}
	
	public static void main(String[] args) {
		C c1 = new C();
		C c2 = new C();
		C c3 = new C();
		C c4 = new C();
		
		System.out.println(c1.i);
		System.out.println(c2.i);
		System.out.println(c3.i);
		System.out.println(c4.i);
		
	}

}
