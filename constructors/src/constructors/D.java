package constructors;

public class D {
	int i;
	int j;
	
	D()
	{
		i = 1;
		j = 2;
	}
	public static void main(String[] args) {
		
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		System.out.println(d1.i + "," + d1.j);
		System.out.println(d2.i + "," + d2.j);
		System.out.println(d3.i + "," + d3.j);
		
	}

}
