import java.util.Arrays;
//left shift by one--(leftmost element removing)//right most getting duplicated
/*		int[] elements = {100, 20, 1, 300, 4, 500, 0, 400,35};
	//                     0    1   2  3    4   5
		
		final output should be like
		int[] elements = {20, 1, 300, 4, 500, 0, 400, 35, 35};

*/
		public class M15
		{
			public static void main(String[] args) {
				
	int[] elements = {100, 20, 1, 300, 4, 500, 0, 400,35};
//                     0    1   2  3    4   5  6   7   
		System.out.println(Arrays.toString(elements));
		
		for(int i = 0; i < elements.length - 1; i++)
		{
			elements[i] = elements[i + 1]; //i is the index value
		}
		System.out.println(Arrays.toString(elements)); //returns string representation content of specify int array	
		
	}

}
