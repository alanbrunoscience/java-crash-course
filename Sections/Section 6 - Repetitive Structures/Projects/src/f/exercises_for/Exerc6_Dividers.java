package f.exercises_for;

import java.util.Scanner;

public class Exerc6_Dividers {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			int number;

			System.out.print("Enter an integer, please: ");
			number = getValidInt(input);

			System.out.printf("%n*** Dividers of %d ***%n%n", number);
			if (number == 0) {
				System.out.println("-> There is no zero divisors in the common arithmetic.");
			} else if (number > 0) {
				positiveDividers(number);
			} else {
				negativeDividers(number);
			}

		}
	}

	private static int getValidInt(Scanner input) {
		while (true) {
			if (input.hasNextInt()) {
				return input.nextInt();
			}
			System.out.print("-> Invalid input! Enter an integer, please: ");
			input.next();
		}
	}

	private static void positiveDividers(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				System.out.println(i);
		}
	}

	private static void negativeDividers(int number) {
		for (int i = -1; i >= number; i--) {
			if (number % i == 0)
				System.out.println(i);
		}
	}

}
