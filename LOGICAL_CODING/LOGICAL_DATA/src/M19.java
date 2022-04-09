
import java.util.Arrays;
//duplicate elements remove

		public class M19
		{
			public static void main(String[] args) {
				
	int[] elements = {10, 20, 3, 10, 11, 10, 15, 3, 50, 15, 20, 10, 40};
                    // 0    1   2  3    4   5  6   7  8 
		System.out.println("contenet in the starting:" + Arrays.toString(elements));
		
		for(int i = 0; i < elements.length; i++)
		{
			for (int j = i + 1; j < elements.length; j++) //j is the changing value of index start from 0
			{
		      if(elements[i]==	elements[j])
		      {
			for(int k = j; k< elements.length-1; k++)
			{
				elements[k] = elements[k+1];
			   }

		     }
			}
		 }
		System.out.println("final output" + Arrays.toString(elements)); //returns string representation content of specify int array	
		
	}

}// 10 will be comapre with all the elements one by one , then 2nd index value will compaer one by one.
		