package constructors;

public class P {
	int i;
	P() //no argument
	{
		i = 10;
		System.out.println("P()");
	}
	P(int i) //with argument0
	{
		this.i = i;
		System.out.println("P()");
	}
	public static void main(String[] args) {
		P p1 = new P();
		P p2 = new P();
		P p3 = new P();
		P p4 = new P();
		System.out.println(p1.i + "," + p2.i + "," + p3.i + "," + p4.i);
		
	
		
	}

}
