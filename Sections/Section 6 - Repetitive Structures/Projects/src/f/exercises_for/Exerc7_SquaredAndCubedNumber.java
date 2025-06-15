package f.exercises_for;

import java.util.Scanner;

public class Exerc7_SquaredAndCubedNumber {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			int numberOfLines;

			System.out.print("Enter the number of lines: ");
			numberOfLines = getValidPositiveInt(input);

			System.out.println();
			for (int i = 1; i <= numberOfLines; i++) {
				System.out.printf("%d %d %d%n", i, i * i, i * i * i);
			}

		}

	}

	private static int getValidPositiveInt(Scanner input) {
		while (true) {
			if (input.hasNextInt()) {
				int num = input.nextInt();
				if (num > 0)
					return num;
				System.out.print("\n-> Please enter a positive integer: ");
			} else {
				System.out.print("\n-> Invalid input! Enter a positive integer: ");
				input.next();
			}
		}
	}

}
