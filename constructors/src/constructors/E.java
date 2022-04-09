package constructors;

public class E {
	
	void test()
	{
		System.out.println("test" + this);
	}
	public static void main(String[] args) {
		
		E e1 = new E();
		System.out.println("main" + e1);
		e1.test();//throuh ref. varibale calling test()
	}
	

}
