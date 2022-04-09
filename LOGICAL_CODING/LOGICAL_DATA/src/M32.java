
import java.util.Arrays;

//INSERT A NEW ELEMENT (ASSUM 15) AT middle
/* 
 initial : {10, 20, 30, 40, 50, 60, 70, 80}
 
 final : { 10, 20, 30, 40, 15, 50, 50, 60, 70, 80}
 */
public class M32
{
	public static void main(String[] args) {
		
int[] elements = {10, 20, 30, 40, 50, 60, 70, 80};
//                 0    1   2  3    4   5  6   7   
System.out.println(Arrays.toString(elements));
//increase size by one unit
    int[] temp = elements;
    elements = new int[elements.length+1]; 
    for(int i = 0; i < temp.length; i++)
{            // 8-1=7
	elements[i] = temp [i]; 
}
	for(int i = elements.length-1; i > elements.length/2; i-- )
	{
		elements[i] = elements[i-1];
	}  
	elements[elements.length/2] = 15;
System.out.println("final output" + Arrays.toString(elements)); //returns string representation content of specify int array	

}

}