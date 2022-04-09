package files;

public class A {
	A()
	{
		System.out.println("A()");
	}
	{
		System.out.println("A-IIB");//excecuting first for any object wise,,no mttr wt constrtor we are using.
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("=======");
		A a2 = new A(90);
		
		
}
	

}
