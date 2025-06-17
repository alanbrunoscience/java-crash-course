package e.functions;

import java.util.Scanner;

/**
 * Make a program to read three integers and display the largest one on the
 * screen.
 */

public class Example1_HighestValueV1 {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {

			int number, greater = Integer.MIN_VALUE;

			for (int i = 0; i < 3; i++) {
				System.out.printf("%d) Enter the %dº integer: ", (i + 1), (i + 1));
				number = input.nextInt();

				if (number > greater) {
					greater = number;
				}
			}

			System.out.printf("%nThe highest value is: %d.%n", greater);

		}

	}

}
