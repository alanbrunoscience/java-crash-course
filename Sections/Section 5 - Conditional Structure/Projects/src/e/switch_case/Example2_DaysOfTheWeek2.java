/**
 * Switch-Case Structure
 * 
 * When there are several flow options to be handled based on the value of a variable, instead of several if-else
 * structures chained together, some prefer to use the switch-case structure.
 * 
 */

package e.switch_case;

import java.util.Scanner;

public class Example2_DaysOfTheWeek2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Variable declaration
		int weekDay;
		String dayName = "";

		// Data input
		System.out.println("*** Day Of The Week ***\n");
		do {
			System.out.print("Enter the day of the week (e.g.: 1 - Sunday, 2 - Monday, ..., 7 - Saturday): ");
			weekDay = input.nextInt();

			if (weekDay <= 0 || weekDay > 7) {
				System.out.println("\n-> Invalid date number. Enter a number between 1 and 7, including.\n");
			}

		} while (weekDay <= 0 || weekDay > 7);

		// Processing
		switch (weekDay) {
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 7:
			dayName = "Saturday";
			break;
		default:
			System.out.println("\n-> Invalid day of the week!");
			break;
		}

		// Data output
		System.out.printf("%n-> Day of the week: %s.%n", dayName);

		input.close();

	}

}
