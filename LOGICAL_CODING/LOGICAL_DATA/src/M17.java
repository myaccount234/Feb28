import java.util.Arrays;
//remove middle element
public class M17
{
	public static void main(String[] args) {
		
   int[] elements = {100, 20, 1, 300, 4, 500, 0, 400,35,45};
      //             0    1   2  3    4   5  6   7   8  //total elemet 9,
   System.out.println(Arrays.toString(elements));
	 /* for(int i = (elements.length/2)-1; i < elements.length-1; i++)
	{
		elements[i] = elements[i + 1];
	}
	for(int i = (elements.length/2)-1; i < elements.length-1; i++)
	{
		elements[i] = elements[i + 1];
	}
	*/
   for(int i = (elements.length/2)-1; i < elements.length-2; i++)
	{
		elements[i] = elements[i + 2]; //removing elemts,,left shift by 2
	}
   
	System.out.println(Arrays.toString(elements));
}
}
