class A1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int[] array = {};
		int[] array1 = {4,3};
		int[] array2 = {0,1};
		System.out.println("array:: " + array.length);
		System.out.println("array1:: " +array1.length);
		System.out.println("array2:: " + array2.length);
	
	if(args.length<1)
	{
      System.out.println("supply one line argument");
      System.out.println(args.length);

	  return;
	}
	
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