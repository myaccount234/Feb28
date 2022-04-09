
public class I {
	
	int a;
	public static void main(String[] args) {
		I ref1 = new I();
		I ref2 = new I();
		ref1.a = 10;
		ref2.a = 20;
		System.out.println(ref1.a);
		System.out.println(ref2.a);
	}

}
