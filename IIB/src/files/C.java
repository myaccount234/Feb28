package files;

public class C {
	C()
	{
		this(90);
		System.out.println("C()");
	}
	C(int i)
	{
		System.out.println("C(int)");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println("-------");
		C c2 = new C(90);
	}

}
