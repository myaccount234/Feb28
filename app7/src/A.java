class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("if block");
		}
		else
		{
			System.out.println("else begin");
			if (true)
			{
				System.out.println("if insifde else");
			}
			System.out.println("else end");
		}

	}
}
