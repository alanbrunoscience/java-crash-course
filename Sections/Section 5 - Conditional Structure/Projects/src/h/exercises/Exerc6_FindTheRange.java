package h.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exerc6_FindTheRange {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		// Variable declaration
		double number;

		// Data input
		System.out.print("Enter a number, please: ");
		number = input.nextDouble();

		if (number < 0 || number > 100) {
			System.out.println("\n-> Number out of the range!");
		} else if (number <= 25) {
			System.out.println("\n-> Range [0, 25]");
		} else if (number <= 50) {
			System.out.println("\n-> Range (25, 50]");
		} else if (number <= 75) {
			System.out.println("\n-> Range (50, 75]");
		} else {
			System.out.println("\n-> Range (75, 100]");
		}

		input.close();

	}

}
