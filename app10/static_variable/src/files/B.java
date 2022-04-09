package files;

public class B {
	static int i;
	static double j;
	static boolean k;
	static char m;
	static byte a;
	static short b;
	static long c;
	static float d;
	 
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m); // \u0000
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		i = 20;
		j = 4.5;
		k = true;
		m = 'p';
		System.out.println("assigned values:");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		}
	

}