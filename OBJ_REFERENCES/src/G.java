
public class G {
	int i  ;
	
	public static void main(String[] args) {
		G g1 = new G();
		G g2 = g1;
		G g3 = g1;
		G g4 = g1;
		G g5 = g3;
		G g6 = g1;
		G g7 = g5;
		g5.i= 700;
		System.out.println(g1.i);
		System.out.println(g2.i);
		System.out.println(g3.i);
		System.out.println(g4.i);
		System.out.println(g5.i);
		System.out.println(g6.i);
		System.out.println(g7.i);
	}

}
