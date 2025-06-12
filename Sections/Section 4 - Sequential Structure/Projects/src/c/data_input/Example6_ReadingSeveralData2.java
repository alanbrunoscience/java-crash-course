/**
 * Reading several data on the same line (Corrected version 1)
 */

package c.data_input;

import java.util.Locale;
import java.util.Scanner;

public class Example6_ReadingSeveralData2 {

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
		x = input.nextLine(); // Lê a linha inteira (incluindo espaços)

		System.out.print("2) Enter an integer, please: ");
		y = input.nextInt();
		input.nextLine(); // Limpa o \n do buffer

		System.out.print("3) Enter a float number, please: ");
		z = input.nextDouble();
		input.nextLine(); // Limpa o \n do buffer

		// Data output
		System.out.println("\n*** Data Output ***\n");
		System.out.printf("1) The string entered was '%s';%n", x);
		System.out.printf("2) The integer entered was '%d';%n", y);
		System.out.printf("3) The float number entered was '%.2f'.%n", z);

		input.close();

	}

}
