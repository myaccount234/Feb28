package app3;

public class M6 {
	public static void test1() {
		System.out.println("test1 begin");
		int i = 100;
		System.out.println("test1 end" + i);
		
	} //this portion is method definition or implimentation.
	
	public static void main(String[] args) {
		System.out.println("main");
		int i = 200;
		test1(); //calling statement end with semicolon
		System.out.println("---------");
		test2();
		System.out.println("end" + i);
	}
	public static void test2() {
		System.out.println("test2 begin");
		int i = 300;
		System.out.println("test1 end");
	}	
} // 3 variable with same name but in 3 different mehod not in one method
