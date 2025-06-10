package h.exercises;

import java.util.Scanner;

public class Exerc2_EvenOrOdd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Variable declaration
		int number;

		// Data input
		System.out.print("Enter an integer number: ");
		number = input.nextInt();

		// Data output
		if (number % 2 == 0) {
			System.out.printf("%n-> '%d' is even!%n", number);
		} else {
			System.out.printf("%n-> '%d' is odd!%n", number);
		}

		// Or
		// System.out.printf((number % 2 == 0) ? "%n-> '%d' is even!%n" : "%n-> '%d' is
		// odd!%n", number);

		input.close();

	}

}
