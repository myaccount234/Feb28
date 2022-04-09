
/* public class K {
	int i;
	static K test()
	{
		K k1 = new K();
		k1.i = 20;
		System.out.println(k1.i);
		return k1; //k1 is local to test method
	}
	
	public static void main(String[] args)
	{
		K obj = test(); //k1 is assigning to k obj as per test method
		System.out.println(obj.i); 
	}

}*/
public class K{
	int i;
	static K test() {
		K k1 = new K();
		k1.i = 40;
		System.out.println(k1.i);
		return k1;
		
	}
	public static void main(String[] args) {
		K obj = test();
		System.out.println(obj.i);
		
	}
}

