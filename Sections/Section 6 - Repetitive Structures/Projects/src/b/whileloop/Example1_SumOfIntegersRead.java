/**
 * While Loop
 * 
 * It is a control structure that repeats a block of commands while a condition is true.
 * 
 * When to use?
 * 
 * => When it is NOT known in advance how many repetitions will be performed.
 * 
 */

package b.whileloop;

import java.util.Scanner;

public class Example1_SumOfIntegersRead {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num, sum = 0;

		System.out.print("Enter a number, please: ");
		num = input.nextInt();

		sum += num;

		while (num != 0) {
			System.out.print("Enter a number, please: ");
			num = input.nextInt();

			sum += num;
		}
		
		System.out.printf("%nThe sum of all numbers read is: %d.%n", sum);

		input.close();

	}

}
