package f.exercises_for;

import java.util.Scanner;

public class Exerc2_InOrOutOfRange {

	// Define range bounds as constants for better maintainability
	private static final int LOWER_BOUND = 10;
	private static final int UPPER_BOUND = 20;

	public static void main(String[] args) {
		// Use try-with-resources to auto-close the Scanner
		try (Scanner input = new Scanner(System.in)) {
			// Variables declaration
			int totalNumbers, number, countIn = 0, countOut = 0;

			// Data Input
			System.out.print("Enter the quantity of numbers you want to read: ");
			totalNumbers = getValidInt(input);

			// Early exit if no numbers to process
			if (totalNumbers <= 0) {
				System.out.println("\n-> No numbers to check. Exiting...");
				return;
			}

			for (int i = 0; i < totalNumbers; i++) {
				System.out.printf("\nEnter the %s integer: ", getOrdinal(i + 1));
				number = getValidInt(input);

				if (number >= LOWER_BOUND && number <= UPPER_BOUND) {
					countIn++;
				} else {
					countOut++;
				}
			}

			System.out.println("\n\n*** Numbers In/Out of Range [10, 20] ***\n");
			System.out.printf("-> In range: %d numbers;%n", countIn);
			System.out.printf("-> Out of range: %d numbers.%n", countOut);
		} // Scanner auto-closes here
	}

	// Helper method: Ensures input is a valid integer (handles empty input and
	// non-integers)
	private static int getValidInt(Scanner input) {
		while (true) {
			if (input.hasNextInt()) {
				return input.nextInt();
			}
			System.out.print("\nInvalid input! Please enter an INTEGER: ");
			input.next(); // Clear invalid input
		}
	}

	// Helper method: Converts number to ordinal (1st, 2nd, 3rd, etc.)
	private static String getOrdinal(int number) {
		int lastTwoDigits = Math.abs(number % 100); // Get the last 2 digits (considering negative)

		if (lastTwoDigits >= 11 && lastTwoDigits <= 13) {
			return number + "th";
		}

		switch (Math.abs(number % 10)) { // Get the last digit (considering negative)
		case 1:
			return number + "st";
		case 2:
			return number + "nd";
		case 3:
			return number + "rd";
		default:
			return number + "th";
		}
	}
}