package files;

public class E {
	static int counter; // counting objects
	E()
	{
		counter ++; // 1 value
	}
	E(int i)
	{
		counter ++; // 1 value
	}
	E(double i)
	{
		counter ++; // 1 value
	}
	public static void main(String[] args) {
		E e1 = new E();
		E e2 = new E(90);
		E e3 = new E(1.5);
		System.out.println(e3.counter);
	}

}
