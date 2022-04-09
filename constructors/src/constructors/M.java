package constructors;

public class M {
	int i;
	
	void test(int i)//global var will prefer by default ,,argumment
	{
		System.out.println(i);
		i = 200; //local variable
	}
	public static void main(String[] args) {
		
		M m1 = new M();
		System.out.println("main" + m1.i);
		m1.test();//throuh ref. varibale calling test()
	}
	

} //incomplete