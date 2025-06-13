package f.exercises_for;

import java.util.Scanner;

public class Exerc2_InOrOutOfRange {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numbers, number, countIn = 0, countOut = 0;

		System.out.print("Enter the quantity of numbers you want to read: ");

		while (!input.hasNextInt()) {
			System.out.print("\n-> Invalid input! Please enter an INTEGER: ");
			input.next();
		}
		numbers = input.nextInt();

		System.out.println();
		for (int i = 0; i < numbers; i++) {
			System.out.printf("\nEnter the %dº integer: ", (i + 1));

			while (!input.hasNextInt()) {
				System.out.print("\n-> Invalid input! Please enter an INTEGER: ");
				input.next();
			}
			number = input.nextInt();

			if (number >= 10 && number <= 20) {
				countIn++;
			} else {
				countOut++;
			}
		}

		System.out.println("\n\n*** Quantity of Numbers In or Out of the Range Between 10 and 20 (inclusive) ***\n");
		System.out.printf("-> In: %d numbers;%n", countIn);
		System.out.printf("-> Out: %d numbers.", countOut);

		input.close();

	}

}
