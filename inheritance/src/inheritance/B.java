 package inheritance;

class A {
int i;
static int j;

void test1()
{
	
	System.out.println("From A.test1");
}
static void test2()
{
	
	System.out.println("From A.test2");
}
}


public class B extends A {
public static void main(String[] args) {
	B b1 = new B();
	System.out.println(b1.i);
	b1.test1();
	System.out.println(B.j);
	B.test2();
}}
	
	 // error check  on video


