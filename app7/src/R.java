class R
{
	public static void main(String[] args)   
	{
		   System.out.println("main begin");

	 if (false)

		   {
			System.out.println("if block");
		   }

	 else  if (true)
			{
				System.out.println("if inside else");
			}
			else
			
		
				if (false)
				{
                System.out.println("else, else if");
				}
				else
			    {
			    System.out.println("else, else else");
				}
	
		    System.out.println("main end");
	    }
      }