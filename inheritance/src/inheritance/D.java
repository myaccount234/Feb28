 package inheritance;

class C {
	
	C()
	{
		super();
		System.out.println("C()");
	}

}
public class D extends C {
	D()
	{
		System.out.println("D()");
	}
	public static void main(String[] args) {
		C c1 = new C();
		System.out.println("-----");
		D d1 = new D();
	}
	
	
}/*
super();
super(90);
 super("abc");
  super(4.5);
   super('a');
    super(true);
    this();
    super(true);
    this(90)
this(2.4)   */
