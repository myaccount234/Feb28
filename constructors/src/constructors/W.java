package constructors;

public class W {
	W(int i)
	{
		System.out.println("W(int)");
	}
	public static void main(String[] args) {
		//W w1 = new W(); compiler not keeping a default constructor.
		W w2 = new W(90);
	}

} 
