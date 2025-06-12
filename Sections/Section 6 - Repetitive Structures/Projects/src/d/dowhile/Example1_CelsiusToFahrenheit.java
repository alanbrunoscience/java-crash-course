/**
 * Do-while
 * 
 * The command block executes at least once, since the condition is checked at the end.
 * 
 */

package d.dowhile;

import java.util.Locale;
import java.util.Scanner;

public class Example1_CelsiusToFahrenheit {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		// Variable declaration
		double tempCelsius, tempFahrenheit;
		char answer;

		// Data input
		System.out.println("*** Celsius to Fahrenheit ***");
		do {
			System.out.print("\nEnter the temperature in Celsius: ");
			tempCelsius = input.nextDouble();

			tempFahrenheit = (9.0 * tempCelsius / 5.0) + 32.0;

			System.out.printf("%n-> %.2fºC in Fahrenheit is %.2f°F.%n", tempCelsius, tempFahrenheit);
			
			System.out.println("\nDo you want to continue? (yes/no)");
			answer = input.next().charAt(0);
			answer = Character.toLowerCase(answer);
			
			while(answer != 'n' && answer != 'y') {
				System.out.printf("%nSorry! Type 'yes' or 'no': ");
				answer = input.next().charAt(0);
				answer = Character.toLowerCase(answer);
			}

		} while (answer != 'n');
		
		System.out.println("\nThanks for using our app! Finishing the program...");

		input.close();

	}

}
