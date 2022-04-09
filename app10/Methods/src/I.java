
public class I {
	public static void main(String[] args) {
		int i = 0;
		int j = test1(i++) + i + test1(++i) + i
		+ test2(i++)+i + test2(++i) + i;
		
		// test1(0) + 1+ test1(2)+2+tset2(2)+3+test2(4)+4
	
		//1   1   5  2   6   3   10   4
		System.out.println(i);
		System.out.println(j);
	}
	static int test1(int i) 
	{
		
		return i++ + i;
	}
	
	static int test2(int i) 
	{
		
		return i++ + i;
	}
	

} // output i 4 j 30
