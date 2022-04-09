class Q

{
	static int i = 10;
    static void test1()
   {
	System.out.println("from test1");
   } 
}
public class V{
	
	static int j = 100;
	static void test2()
	{
		System.out.println("from test2");
	}
	public static void main(String[] args)
	{
	//	System.out.println(i);
		System.out.println(Q.i);
		System.out.println(j);
		System.out.println(V.j);
	//	test1();
		Q.test1(); //by using other class member we hv to using along with class name
		test2();
		 V.test2();
	}
}	
	
	
	
//CHECKK CLASS NAME // CHECK THIS PROGRAM IN EDITPLUS
	
	
	
	
	
	
	
}
