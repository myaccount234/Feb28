class S
  
{ 
	public static void main(String[] args) 
	{
		int i = 10;
		final int j = 10;
		switch(i)
		{
			case 5:
            System.out.println("case 5");
			case j:
            System.out.println("case 10");
			
	}
}
}
//output--case10(final is initialize and used in cases,,