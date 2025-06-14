package f.exercises_for;

import java.util.Locale;
import java.util.Scanner;

public class Exerc4_Division {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			int numberOfDivisions, numerator, denominator;

			System.out.print("Enter the number of divisions you wanna do: ");
			numberOfDivisions = getValidInt(input);

			for (int i = 0; i < numberOfDivisions; i++) {

				System.out.printf("%n======= %s Division =======%n", getOrdinal(i + 1));

				System.out.print("\n1) Enter the numerator value: ");
				numerator = getValidInt(input);

				System.out.print("\n2) Enter the denominator value: ");
				denominator = getValidInt(input);

				performDivision(numerator, denominator);

			}

		}

	}

	private static int getValidInt(Scanner input) {
		while (true) {
			if (input.hasNextInt()) {
				return input.nextInt();
			}
			System.out.print("\nInvalid input! Please enter an INTEGER: ");
			input.next(); // Clear invalid input
		}
	}

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

	private static void performDivision(int numerator, int denominator) {
		if (denominator == 0) {
			System.out.printf("%n-> Cannot divide by zero.%n");
		} else {
			System.out.printf("%n-> %d / %d = %.2f%n", numerator, denominator, (double) numerator / denominator);
		}
	}

}
