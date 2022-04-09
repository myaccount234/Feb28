package files;

public class B {
	public static void main(String[] args) 
	{
	System.out.println("total arg:" + args.length);
	for(String arg : args) // for loop used in order to read memebers of args
	System.out.println(arg);
	
	}
	
	
} 

//output check in editplus as 

// 123 true 456
//total arg:3
//123 
// true 
// 456
