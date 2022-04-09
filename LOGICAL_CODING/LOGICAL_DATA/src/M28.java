import java.util.Arrays;

//right shift by 1
/* 
 initial : {10, 20, 30, 40, 50, 60, 70, 80}
 
 final : {10, 10, 20, 30, 40, 50, 60, 70}
 */
public class M28
		{
			public static void main(String[] args) {
				
	int[] elements = {10, 20, 30, 40, 50, 60, 70, 80};
//                     0    1   2  3    4   5  6   7   
		System.out.println(Arrays.toString(elements));
		
		for(int i = elements.length - 1; i>0; i--)
		{            // 8-1=7
			elements[i] = elements[i - 1]; // minuses value everytime//i is the index value
		    //element[7]= element[7-1=6] now element of index 7 set to element 6 index
		
		}    
		System.out.println(Arrays.toString(elements)); //returns string representation content of specify int array	
		
	}

}
