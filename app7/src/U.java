class U
 {
	public static void main(String[] args) 
	{
		if (args.length == 0)
		{
		System.out.println("please supply one int command line argument");
		return;
	}
	int marks = Integer.parseInt(args[0]);
	if(marks < 35)
	{
   System.out.println("you have failed");
	}
	else if(marks >=35 && marks < 60)
		{
			System.out.println("you have just passes");
		}
		else if(marks >= 60 && marks < 70)
		{
			System.out.println("you passed in !st class");
		
		}
		else if(marks >= 70 && marks < 85)
		{
			System.out.println("you passed in distinction");
		
		}
		else if(marks >= 85 && marks < 100)
		{
			System.out.println("outstanding performance");
		}
   else
		{
			System.out.println("invalid marks");
		}
	}
}
