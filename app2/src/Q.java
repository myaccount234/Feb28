// input should be even number and should not be greater than 20
 class Q 
{
	public static void main(String[] args) 
	{
		if (args.length == 0)
		{
			System.out.println("please spply one command line argu");
			return;
		}
		int i = Integer.parseInt(args[0]);
		if (i <= 20)
		{
		if (i % 2 == 0)
		{
			System.out.println("input is proper");
		}
		else
		{
			System.out.println("input is not an even number");
		}
	}
	else 
	{
		System.out.println("input should not be graeter than 20");
	}
}
}