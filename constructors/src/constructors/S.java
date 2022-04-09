package constructors;

public class S {
	S()
	{
		this(10);
		System.out.println("S()");
	}
	S(int i)
	{
		this(4.5);
		System.out.println("S(int)");
	}
	S(double i)
	{
		System.out.println("S(double)");
	}
	public static void main(String[] args) {
		S s1 = new S(); //by default S(double)constructor used,,this not availbl
		System.out.println("------");
		S s2 = new S(100);
		System.out.println("----------");
		S s3 = new S(1.5);
		System.out.println("=======");
	}

}// from one constructor body we can avail any other constructr
//output -S(double)
//S(int)
//S()
//------
//S(double)
//S(int)
//----------
//S(double)
//=======