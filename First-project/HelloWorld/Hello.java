import java.util.*;

public class Hello {
	private static final String Scanner = null;
	static int count = 0;
	private static int b = 10;
	public Hello() {
		count ++;
		System.out.println(count);
	}
	
	public static int tongHaiSo(int a) {
		return a + b;
	}
	
	
	
	public static void main(String[] args) {
		/*int x = 10;
		int y = 14;
		System.out.println(tongHaiSo(x));
		function_a a = new function_a();*/
		
		/*System.out.println(a.get());
		Hello s1 = new Hello();
		Hello s2 = new Hello();
		Hello s3 = new Hello();
		System.out.println(b);*/
		
		/*String str = "Ayee yoo what zuppp";
		String[] output = str.split(" ");
		for (int i = 0; i < output.length ; i++ ) {
			System.out.println(output[i]);*/
		
		int a;
		Scanner S = new Scanner(System.in);
		a = S.nextInt();
		a*=10;
		System.out.println(a);
		S.close();
		}
	}
	
	

