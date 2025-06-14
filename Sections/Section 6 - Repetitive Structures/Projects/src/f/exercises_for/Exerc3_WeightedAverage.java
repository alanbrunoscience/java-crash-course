package f.exercises_for;

import java.util.Locale;
import java.util.Scanner;

public class Exerc3_WeightedAverage {

	private static final double WEIGHT_A = 2.0;
	private static final double WEIGHT_B = 3.0;
	private static final double WEIGHT_C = 5.0;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Use try-with-resources to auto-close the Scanner
		try (Scanner input = new Scanner(System.in)) {

			// Variables declaration
			int numberOfTests;
			double testA, testB, testC, weightedAverage, totalWeight;

			// Data input
			System.out.print("Enter the number of test cases: ");
			numberOfTests = getValidInt(input);

			// Processing
			for (int i = 0; i < numberOfTests; i++) {
				System.out.printf("%n%n======= %s Test Case =======%n", getOrdinal(i + 1));

				System.out.printf("%n1) Enter the first test value: ");
				testA = getValidDouble(input);

				System.out.printf("%n2) Enter the second test value: ");
				testB = getValidDouble(input);

				System.out.printf("%n3) Enter the third test value: ");
				testC = getValidDouble(input);

				totalWeight = WEIGHT_A + WEIGHT_B + WEIGHT_C;
				weightedAverage = (testA * WEIGHT_A + testB * WEIGHT_B + testC * WEIGHT_C) / totalWeight;

				System.out.printf("%n-> Weighted average of %.2f, %.2f, and %.2f is %.2f.%n", testA, testB, testC,
						weightedAverage);

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

	private static double getValidDouble(Scanner input) {
		while (true) {
			if (input.hasNextDouble()) {
				return input.nextDouble();
			}
			System.out.print("\nInvalid input! Please enter a floating-point number: ");
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

}
