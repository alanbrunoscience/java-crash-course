/**
 * NOT Operator (!)
 * 
 * The NOT operator (!) inverts the condition.
 * 
 * !F => V
 * !V => F
 * 
 */

package b.logicalexpressions;

public class Example3_NotOperator {

	public static void main(String[] args) {

		// Variable declaration
		int x = 5;

		// Data output
		System.out.println("*** Logical Expressions Examples (!) ***\n");
		System.out.printf("-> x = %d%n%n", x);
		System.out.printf("1) !(x == 10) -> %s;%n", !(x == 10)); // true
		System.out.printf("2) !(x >= 2) -> %s;%n", !(x >= 2)); // false
		System.out.printf("3) !(x <= 20 && x == 10) -> %s.%n", !(x <= 20 && x == 10)); // true

	}

}
