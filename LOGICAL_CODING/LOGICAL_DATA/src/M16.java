import java.util.Arrays;
//remove specified index elements(index no. 5)
/*		int[] elements = {100, 20, 1, 300, 4, 500, 0, 400,35};
	//                     0    1   2  3    4   5
		final output should be like
		int[] elements = {100, 20, 1, 300, 4, 0, 400, 35, 35};

*/
		public class M16
		{
			public static void main(String[] args) {
				
	int[] elements = {100, 20, 1, 300, 4, 500, 0, 400,35};
//                     0    1   2  3    4   5  6   7   8
		System.out.println(Arrays.toString(elements));
		for(int i = 5; i < elements.length - 1; i++)
		{
			elements[i] = elements[i + 1];
		}
		System.out.println(Arrays.toString(elements)); //returns string representation content of specify int array	
		
	}

} // correct