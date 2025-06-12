/**
 * Reading several data on the same line (Corrected version 2)
 * 
 * "Parse" Method
 * 
 * In Java, the "parse" method (or, more precisely, methods that follow the "parse" pattern) are used to convert a string 
 * to a different data type. They are essential for working with data values ​​that are initially stored as strings, such
 * as numbers, dates, etc., and need to be processed in code like other data types.
 * 
 * Examples of "parse" methods in Java:
 * 
 * - Integer.parseInt(String s): Converts a string to an integer value (int);
 * - Double.parseDouble(String s): Converts a string to a floating point value (double);
 * - Boolean.parseBoolean(String s): Converts a string to a boolean value;
 * - LocalDate.parse(String text) (Java 8+): Converts a string to a LocalDate object (representing a date);
 * - LocalDateTime.parse(String text) (Java 8+): Converts a string to a LocalDateTime object (representing a date and 
 * time).
 * 
 */

package c.data_input;

import java.util.Locale;
import java.util.Scanner;

public class Example7_ReadingSeveralData3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Creating an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Variables declaration
		String x;
		int y;
		double z;

		// Data input
		System.out.print("1) Enter a string, please: ");
		x = input.nextLine(); // Read the entire line (including spaces)

		System.out.print("2) Enter an integer, please: ");
		y = Integer.parseInt(input.nextLine());

		System.out.print("3) Enter a float number, please: ");
		z = Double.parseDouble(input.nextLine());

		// Data output
		System.out.println("\n*** Data Output ***\n");
		System.out.printf("1) The string entered was '%s';%n", x);
		System.out.printf("2) The integer entered was '%d';%n", y);
		System.out.printf("3) The float number entered was '%.2f'.%n", z);

		input.close();

	}

}
