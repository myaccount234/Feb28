import java.util.Arrays;
//remove 2nd and last 2nd elements from given array {10, 20, 3, 22, 11, 55, 20, 40, 50}


public class M18
		{
			public static void main(String[] args) {
				
	int[] elements = {100, 20, 3, 22, 11, 55, 15, 40,50};
//                     0    1   2  3    4   5  6   7   8
		System.out.println(elements.length + "===" + "content in the starting" +  Arrays.toString(elements));
		for(int i = 1; i < elements.length - 1; i++)
		{
			elements[i] = elements[i + 1];
		
		}
		//{10,3,22,11,55,20,40,50,50}
		//remove 40 (index no -6)
		for(int i = elements.length-3; i <elements.length-1;  i++)
		{
			elements[i] = elements[i + 1];
		
		}
		
	System.out.println("final result" + Arrays.toString(elements)); //returns string representation content of specify int array	
		
	
		
	}

}