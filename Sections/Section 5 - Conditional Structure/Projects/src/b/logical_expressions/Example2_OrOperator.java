/**
 * OR Operator (||)
 * 
 * At least one of the conditions must be true.
 * 
 * F || F => F
 * F || V => V
 * V || F => V
 * V || V => V
 * 
 */

package b.logical_expressions;

public class Example2_OrOperator {

	public static void main(String[] args) {

		// Variable declaration
		int x = 5;

		// Data output
		System.out.println("*** Logical Expressions Examples (||) ***\n");
		System.out.printf("-> x = %d%n%n", x);
		System.out.printf("1) x == 10 || x <= 20 -> %s;%n", x == 10 || x <= 20); // true
		System.out.printf("2) x > 0 || x != 3 -> %s;%n", x > 0 || x != 3); // true
		System.out.printf("3) x <= 0 || x != 3 || x != 5 -> %s.%n", x <= 0 || x != 3 || x != 5); // true

	}

}
