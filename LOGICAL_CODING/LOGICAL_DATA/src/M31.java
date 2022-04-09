import java.util.Arrays;

//INSERT A NEW ELEMENT (ASSUM 15) AT INDEX NO = 0
/* 
 initial : {10, 20, 30, 40, 50, 60, 70, 80}
 
 final : {15, 10, 20, 30, 40, 50, 50, 60, 70, 80}
 */
public class M31
{
	public static void main(String[] args) {
		
int[] elements = {10, 20, 30, 40, 50, 60, 70, 80};
//                 0    1   2  3    4   5  6   7   
System.out.println(Arrays.toString(elements));
//increase size by one unit
    int[] temp = elements;
    elements = new int[elements.length+1];
     elements[0] = 15;

for(int i = 0; i < temp.length; i++)
{            // 8-1=7
	elements[i + 1] = temp [i]; // minuses value everytime//i is the index value
    //element[7]= element[7-1=6] now element of index 7 set to element 6 index

}    
System.out.println("final output" + Arrays.toString(elements)); //returns string representation content of specify int array	

}

}