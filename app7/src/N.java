class N
{
	public static void main(String[] args)   
	{
		   System.out.println("main begin");

	 if (false)

		   {
			System.out.println("if block");
		   }
	 else
		   
			  
			   
		   if (false)
			{
				System.out.println("if inside else");
			}
			else
			{
				System.out.println("else inside else begin");
				if (false)
				{
                System.out.println("else, else if");
				}
				else
			    {
			    System.out.println("else, else else");
				}
				 System.out.println("else inside else end");
			}
		
		
		    System.out.println("main end");

	}
}