package constructors;

public class K {
	static int i;
	public static void main(String[] args) {
		System.out.println("main1:" + i);
		i = 200;
		System.out.println("main2:" + i);
		 int i = 500;
		 System.out.println("main3" + i);
		 System.out.println("main4" + K.i);
	}

}
