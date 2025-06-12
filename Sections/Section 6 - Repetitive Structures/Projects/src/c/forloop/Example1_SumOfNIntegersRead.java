/**
 * For Loop
 * 
 * It is a control structure that repeats a block of commands for a given range of values.
 * 
 * When to use?
 * 
 * => When it IS known in advance how many repetitions will be performed or the range of values.
 * 
 */

package c.forloop;

import java.util.Scanner;

public class Example1_SumOfNIntegersRead {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Variables declaration
		int numbers, number, sum = 0;

		// Data input
		System.out.print("How many numbers do you want to read? ");
		numbers = input.nextInt();

		System.out.println();
		for (int i = 0; i < numbers; i++) {
			System.out.print("Enter an integer: ");
			number = input.nextInt();

			sum += number;
		}

		// Data output
		System.out.printf("%nThe sum of all numbers read is: %d.%n", sum);

		input.close();

	}

}
