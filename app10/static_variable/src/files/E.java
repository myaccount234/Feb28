package files;

public class E {
static int i; 
public static void main(String[] args) {
	
	System.out.println("main1:" + i);
	i = 10;
	System.out.println("main2:" + i);
	i = 20;
	System.out.println("main3:" + i);
	int i = 200; //local scope.inside main
	System.out.println("main4:" + i); // local and global varibale both are having same nam,, local variable will be preferred.
	

}
}
