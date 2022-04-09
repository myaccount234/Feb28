
public class H {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("main1:" + i);
		int j = test(i); //test(1)
		
		System.out.println("main2:" + i + "," + j);
		int k = test(j++);
		System.out.println("main3:" + i + "," + j + "," + k);
		int m = test(k++);
		System.out.println("main4:" + i + "," + j + "," + k + "," + m);
		
		}
	static int test(int i)
	{
		System.out.println("test" + i);
		return i++ + i;
	}

}
