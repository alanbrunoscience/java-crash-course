package f.exercises_for;

import java.util.Scanner;

public class Exerc5_Factorial {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			int number;

			System.out.print("Enter an integer number: ");
			number = getValidInt(input);

			if (number < 0) {
				System.out.println("\n-> Factorial is not defined for negative numbers.");
				return;
			}

			System.out.print("\n-> ");
			for (int i = number; i > 0; i--) {
				if (i != 1) {
					System.out.printf("%d * ", i);
				} else {
					System.out.print("1 = ");
				}
			}
			System.out.printf("%d%n", factorial(number));

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

	private static long factorial(int number) {
		if (number == 0)
			return 1; // Base case

		return number * factorial(number - 1); // Recursive case
	}
}
