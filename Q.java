class Q
  
{ enum Test {t1, t2, t3};
	public static void main(String[] args) 
	{
		Test ref = Test.t2;
		switch(ref)
		{
			case t1:
            System.out.println("case t1");
			case t2:
            System.out.println("case t2");
			break;
			case t3:
            System.out.println("case t3");
	}
}
}
//output-- case t2