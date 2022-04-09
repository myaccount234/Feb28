package files;

public class H {
	static int i;
	public static void main(String[] args) {
		System.out.println(H.i);
		H.i = 300;// static member used with class name.
		System.out.println(H.i);
		H.i = H.i + 800;
		System.out.println(H.i);
		H.i = H.i - 300; //1100-300=800
		System.out.println(H.i);
		
	}

}
