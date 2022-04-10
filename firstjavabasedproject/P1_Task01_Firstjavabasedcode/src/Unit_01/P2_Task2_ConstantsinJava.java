package Unit_01;

public class P2_Task2_ConstantsinJava {
static final int a = 10;
	
	final static int c = 12;
	
	//Visibility:same class + same package + other package
	public static final double pi = 3.14f;
	
	//Visibility:within same class 
	private static final double di = 3.14f;
	
	//Visibility:same class + same package 
	protected static final double si = 3.14f;
	
	public static void main(String[] args) {
		
//		The final local variable b cannot be assigned. It must be blank and not using a compound assignment
		final int b = 90;
		//b = 99;
		
//		Cannot make a static reference to the non-static field c
		System.out.println(c);
	}
	
	void display() {
		System.out.println(a);
		
		System.out.println(pi);
		
		System.out.println(c);
		
//		b cannot be resolved to a variable
		//System.out.println(b);
	}

}
