package constructors;

public class U {
	U(int i, int j)
			{
		System.out.println("U(inti,intj)");
			}
	U(int i, double j)
	{
		System.out.println("U(int, double)");
		
	}
	public static void main(String[] args) {
		U u1 = new U(10,20);
		System.out.println("=====");
		U u2 = new U(10, 1.5);
	}

}
//numbr of argument should change and data type also.