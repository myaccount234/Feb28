package constructors;

public class O {
	int i;
	O(int i)
	{
		this.i = i; //local assigning to global
	}
	public static void main(String[] args) {
		O obj1 = new O(90);
		O obj2 = new O(10);
		O obj3 = new O(20);
		O obj4 = new O(30);
		System.out.println("obj1.i");
		System.out.println("obj2.i");
		System.out.println("obj3.i");
		System.out.println("obj4.i");
	}

}
