package f.exercises_for;

import java.util.Scanner;

public class Exerc1_OddNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number;

		System.out.print("Enter an integer value between 1 and 1000 (inclusive): ");

		// Check if input is an integer
		while (!input.hasNextInt()) {
			System.out.print("\nInvalid input! Please enter an INTEGER between 1 and 1000: ");
			input.next(); // Clear invalid input
		}
		number = input.nextInt();

		while (number < 1 || number > 1000) {
			System.out.print("\n-> Number out of range! Enter an integer between 1 and 1000: ");

			while (!input.hasNextInt()) { // Ensure next input is an integer
				System.out.print("\nInvalid input! Please enter an INTEGER: ");
				input.next(); // Clear invalid input
			}
			number = input.nextInt();
		}

		System.out.printf("%n*** Odd numbers until %d ***%n%n", number);
		for (int i = 1; i <= number; i += 2) {
			System.out.println(i);
		}

		input.close();

	}

}
