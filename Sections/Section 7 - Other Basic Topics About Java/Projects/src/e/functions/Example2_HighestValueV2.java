package e.functions;

import java.util.Scanner;

/**
 * Make a program to read three integers and display the largest one on the
 * screen.
 */

public class Example2_HighestValueV2 {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			int[] numbers = new int[5];
			int number;

			for (int i = 0; i < 3; i++) {
				System.out.printf("%d) Enter the %s integer: ", (i + 1), getOrdinal(i + 1));
				number = input.nextInt();

				numbers[i] = number;
			}

			int higher = max(numbers);

			displayResult(higher);

		}

	}

	private static int max(int[] numbers) {

		int greater = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > greater) {
				greater = numbers[i];
			}
		}

		return greater;

	}

	private static void displayResult(int number) {
		System.out.printf("%nThe highest value is: %d.%n", number);
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
