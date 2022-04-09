package app3;

public class M5 {
	public static void test1() {
		System.out.println("test1");
	} //this portion is method definition or implimentation.
	
	public static void main(String[] args) {
		System.out.println("main");
		test1(); //calling statement end with semicolon
		System.out.println("---------");
		test2();
		System.out.println("end");
	}
	public static void test2() {
		System.out.println("test2");
	} //

}
//in the main method body we can call other method,,whole main method body will excecute,, test1() used as calling function.