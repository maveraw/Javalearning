package Unit_01;

public class P3_Task01_VariablesandDatatypesinJava {
	static int g = 11;
	int p = 10;
	public static void main(String[] args) {
	// Valid Declarations
	int a, b, c;
	float pi;
	double d;
	char e;
	// Valid Initializations
	pi = 3.14f; 
	d = 20.22d;
	e='v';
	a= 10;
	b = 10;
	c = 10;
	System. out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(pi);
	System.out.println(d);
	System.out.println(e);

	int myNum = 5; // Integer (whole number)
	float myFloatNum = 5.99f; // Floating point number
	char myLetter = 'D'; // Character
	boolean myBool = true; // Boolean
	String myText = "Hello"; // String
	System.out.println(myNum);
	System.out.println(myFloatNum);
	System.out.println(myLetter);
	System.out.println(myBool); 
	System.out.println(myText);
	
	double f;
	int i = 10;
	f = i; // Type Conversion
	double g = 10;
	int j;

	j = (int) g; // Type Casting
	System.out.println(f);
	System.out.println(i);
	System.out.println(g);
	System.out.println(j);

	byte k = 10; // 1 byte I
	boolean l = true; // 1 bit = true or false only
	long m = 10L;
	float n = 1.2f;
	double o = 1.2d;
	System.out.println(k);
	System.out.println(1);
	System.out.println(m);
	System.out.println(n);
	System.out.println(o);
	
	System.out.println(ABC.j); // data + functions/methods
	// ABC. display();
	ABC obj1 = new ABC();
	System.out.println(obj1.i++);
	System.out.println(obj1.i);
	ABC obj2 = new ABC();
	System.out.println(obj2.i);
	// System.out.println(objl.j++);
	// System.out.println(obj1.j);
	// System.out.println(obj2.j);
	System.out.println(ABC.j++); 
	System.out.println(ABC.j);
	
	ABC.typeCoversionAndTypeCasting();
	
	}
	int r = 10;
	void display() {
	int a = 5; // local Variable
		System.out.println("This is Display Metiod!");
		System.out.println(a);
		}
	}

	class ABC {
	static int j = 10; // class variable/static variable
	int i = 10; // Instance Variable
	static void display() {
	int a = 5; // local Variable
	System.out.println("This is Display Method!");
	System.out.println(a);

	}
	
	static void typeCoversionAndTypeCasting() {
		
		double f; //64 slots
		int i = 10; //32 slots
		f = i; // Type Conversion
		System.out.println(f);
		double g = 10; //64
		int j; //32
		j = (int)g; // Type Casting
		//32 bits = 64 bits
		System.out.println(i);
		System.out.println(j);
		
	}
	

}
