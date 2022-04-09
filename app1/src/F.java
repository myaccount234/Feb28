class F 
{
	public static void main(String[] args) 

	{
		 String s1 = args[0];
		 String s2 = args[1];
		int i = Integer.parseInt(s1);
		int k = Integer.parseInt(s2);
		int min = i;
		if (k < i)
		{
			min = k;
		}
		System.out.println("min between=======" + i +"and" + k +"is" + min);

	}
}

output==E:\feb28\app1\src>java -cp ../classes F 24 34
min between 24 and 34 is 24