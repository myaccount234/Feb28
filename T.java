class T
  
{ 
	public static void main(String[] args) 
	{
		int i = 10;
		final int J;
			j = 10; //compl error,, compiler does not take as constant expression,, j cnnt use
		switch(i)
		{
			case 5:
            System.out.println("case 5");
			case j:
            System.out.println("case 10");
			
	}
}
}