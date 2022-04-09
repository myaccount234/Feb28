class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
	
	if(args.length<2)
	{
      System.out.println("supply one line argument");
      System.out.println(args.length);

	  return;
	  
	}
	//System.out.println("args.length:  "  + args.length);
	
	int i = Integer.parseInt(args[0]);
	System.out.println("value of i" + i);
	switch(i)
	{
		case 1:
		System.out.println("case1");
		System.out.println("case1");
		break;

		case 5:
			System.out.println("case5");
		System.out.println("case5");
		break;
	}
}
}