package inheritance;

class G {
	G()
	{
		System.out.println("G()");
	}
	G(int i)
	{
		System.out.println("G(int)");
	}

}
class H extends G
{
	H()
	{
		System.out.println("H()");
	}

	H (int i)
	{
		System.out.println("H(int)");
	}
	}
class I extends H
{
	I()
	{
		super(10);
		System.out.println("I()");
	}

	I (int i)
	{
		System.out.println("I(int)");
	}
	}
class J extends I
{
	J()
	{
		super(10);
		System.out.println("J()");
	}

	J (int i)
	{
		System.out.println("J(int)");
	}
	}
class K extends J
{
	K()
	{
		super(10);
		System.out.println("K()");
	}

	K (int i)
	{
		System.out.println("K(int)");
	}
	}
public static void main(String[] args) {
	K k1 = new K();
	System.out.println("-----");
	K k2 = new K(90);
}


//taking same output as previous
