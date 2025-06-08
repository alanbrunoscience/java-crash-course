/**
 * AND Operator (&&)
 * 
 * All the conditions must be true.
 * 
 * F && F => F
 * F && V => F
 * V && F => F
 * V && V => V
 * 
 */

package b.logicalexpressions;

public class Example1_AndOperator {

	public static void main(String[] args) {

		// Variable declaration
		int x = 5;
		
		// Data output
		System.out.println("*** Logical Expressions Examples (&&) ***\n");
		System.out.printf("-> x = %d%n%n", x);
		System.out.printf("1) x <= 20 && x == 10 -> %s;%n", x <= 20 && x == 10);
		System.out.printf("2) x > 0 && x != 3 -> %s;%n", x > 0 && x != 3);
		System.out.printf("3) x <= 20 && x == 10 && x != 3 -> %s.%n", x <= 20 && x == 10 && x != 3);
	
	}

}
