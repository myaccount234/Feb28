package files;

public class F {
static int i; 
public static void main(String[] args) {
	
	System.out.println("main1:" + i);
	i = 10;
	System.out.println("main2:" + i);
	i = 20;
	System.out.println("main3:" + i);
	int i = 200; //local scope.inside main
	System.out.println("main4:" + i); // local and global varibale both are having same nam,, local variable will be preferred.
	i = 205;
	System.out.println("main5:" + i);
	F.i = 400; //global varibale because class name use
	System.out.println("main6:" + F.i);
	F.i = i + 600;
	System.out.println("main7:" + F.i); //output---805= i value 205 within body used above local variable+ 600
	i = F.i + 700;
	System.out.println("main8:" + i);
	System.out.println("main9:" + F.i);

}
}
