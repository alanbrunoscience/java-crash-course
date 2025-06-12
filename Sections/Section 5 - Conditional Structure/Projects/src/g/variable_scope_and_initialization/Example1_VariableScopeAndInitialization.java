/**
 * Variable Scope and Initialization
 * 
 * - Scope of a variable: is the region of the program where the variable is valid, that is, where it can be referenced;
 * 
 * - A variable cannot be used if it is not initialized.
 * 
 */

package g.variable_scope_and_initialization;

import java.util.Locale;
import java.util.Scanner;

public class Example1_VariableScopeAndInitialization {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		// Variables declaration
		double price;

		// Data input
		System.out.print("Enter the price: US$ ");
		price = input.nextDouble();

		// Processing
		if (price > 100.0) {
			double discount = price * 0.1;
		}

		// Data output
//		System.out.printf("%n-> The new price is US$ %.2f, and the discount applied was US$ %.2f.%n",
//				(price - discount), discount); // ❌ Error: discount cannot be resolved to a variable

		input.close();

	}

}
