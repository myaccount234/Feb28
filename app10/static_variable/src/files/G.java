package files;

public class G {
	static boolean i;
	public static void main(String[] args) {
		System.out.println("main1:" + i);
		System.out.println("main2:" + G.i);
		i = true;
		System.out.println("main3:" + i);
		System.out.println("main4:" + G.i);
		double i = 3.5;
		System.out.println("main5:" + i);
		System.out.println("main6:" + G.i); //boolean class used
		i = i + 3.5;
		G.i = !G.i;
		System.out.println("main7:" + i);
		System.out.println("main8:" + G.i);
	
	}

}
