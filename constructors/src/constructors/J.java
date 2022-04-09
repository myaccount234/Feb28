package constructors;

public class J {
	int a;
	J()
	{
		a = 200; //this.a = 200
	}
	public static void main(String[] args) {
		
		J j1 = new J();
		System.out.println("main" + j1.a);
		J j2 = new J();
		System.out.println("main2" + j2.a);
	}

}
