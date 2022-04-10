package Unit_01;

public class P3_Task02_OperatorsinJava {
           
	
	public static void main(String[] args) {
		OperatorsInJava obj = new OperatorsInJava();
		obj.UnaryOperator();
		obj.ArithmeticOperator();
		obj.ShiftOperator();
		obj.Relational0perator();
		obj.BitwiseAndLogicalOperators();
		obj.TernaryOperator();
		obj.AssignmentOperator();

		}

}

class OperatorsInJava {

	void UnaryOperator() {
		int a = 10;
		boolean b = false;
		System.out.println("Inside UnaryOperator”");
		System.out.println(a++); //10
		System.out.println(a--); //11
		System.out.println(++a); //11
		System.out.println(--a); //10
		System.out.println(~a);
		System.out.println(!b);
		System.out.println("\n");
	
	}
	
	void ArithmeticOperator() {
		System.out.println("Inside ArithmeticOperator");
		int a = 10;
		int b = 5;
		System.out.println(a + 6);// 15
		System.out.println(a - b);// 5
		System.out.println(a * b);// 50
		System.out.println(a / b);// 2
		System.out.println(a % b);// @
		System.out.println(((10 * 10) / 5) + 3 - ((1 * 4) / 2));
		System.out.println("\n");

		}

		void ShiftOperator() {
		System.out.println("Inside ShiftOperator");
		
		System.out.println(10 << 2);// 10*2*2=10*4=40
		System.out.println(10 << 3);// 10*2*3=10*«8=80
		System.out.println(20 << 2);// 26*2*2=20*4=80
		System.out.println(15 << 4);// 15*2%4=15*16=240
		System.out.println(10 >> 2);// 10/2°2=10/4=2
		System.out.println(20 >> 2);// 20/2°2=20/4=5
		System.out.println(20 >> 3);// 20/2°3=20/8=2
		System.out.println("\n");

		}
		
		

		// result is true or false

		void Relational0perator() {
		System.out.println("Inside RelationalOperator");
		int a = 10;
		int b = 20;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println("\n");
		}
		
		void BitwiseAndLogicalOperators() {
			System.out.println("Inside BitwiseAndLogical0perators");
			int a=10;

			int b=5;

			int c=20;

			//Logical && and Bitwise &

			System.out.println(a<b && a++<c); //false & true = false
			System.out.println(a); //1® because second condition is not checked
			System.out.println(a<b & a++<c); //false && true = false
			System.out.println(a); //11 because second condition is checked
			//Logical || and Bitwise |

			System.out.println(a>b||a<c);//true || true = true

			System.out.println(a>b||a<c);//true | true = true
			System.out.println(a>b|a++<c);//true || true = true
			System.out.println(a);//10 because second condition is not checked
			System.out.println(a>b|a++<c);//true | true = true
			System.out.println(a);//11 because second condition is checked
			
			System.out.println("Bitwise inclusive OR:"+(12|12));// 110@ | 1100 = 110¢
			System.out.println("Bitwise exclusive OR:"+(12^12));// 110@ ~ 1100 = 0e0e
			System.out.println("\n");
			}
			void TernaryOperator() {
			System.out.println("Inside TernaryOperator");
			int a = 2;
			int b = 5;
			int min = (a<b) ? a: b;
			System.out.println(min);
			System.out.println("\n");
			}
			
			
			void AssignmentOperator() {
				System.out.println("Inside AssignmentOperator");
				int a=10;

				int b=20;

				a+=4;//azat4 (a=10+4)
				b-=4;//b=b-4 (b=2@-4)
				System.out.println(a);
				System.out.println(b);
				

				b>>>=2;
				System.out.println(b);
				a=10;

				a+=3;

				System. out.println(a);
				a-=4;
				System.out.println(a);
				a*=2;
				System.out.println(a);
				a/=2;

				System.out.println(a);
				System.out.println("\n");
				
			}
}
