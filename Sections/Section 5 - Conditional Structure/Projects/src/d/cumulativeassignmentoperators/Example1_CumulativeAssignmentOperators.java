/**
 * Cumulative Assignment Operators
 * 
 * +--------------------+--------------------+
 * | Compound Operator  | Expanded Equivalent|
 * +--------------------+--------------------+
 * | a += b             | a = a + b          |
 * | a -= b             | a = a - b          |
 * | a *= b             | a = a * b          |
 * | a /= b             | a = a / b          |
 * | a %= b             | a = a % b          |
 * +--------------------+--------------------+
 * 
 */

package d.cumulativeassignmentoperators;

import java.util.Locale;
import java.util.Scanner;

public class Example1_CumulativeAssignmentOperators {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);

		int mins;
		double totalPayable = 50.0;

		System.out.print("Enter the total number of minutes consumed: ");
		mins = input.nextInt();

		if (mins > 100) {
			totalPayable += (mins - 100) * 2.0;
		}

		System.out.printf("\n-> Amount to pay: US$ %.2f.%n", totalPayable);

		input.close();

	}

}
