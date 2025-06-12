package e.exercises;

import java.util.Scanner;

public class Exerc3_DifferenceCalculation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a, b, c, d, difference;

		System.out.println("*** DIFFERENCE CALCULATION ***\n");

		System.out.print("1) Enter the first value: ");
		a = input.nextInt();

		System.out.print("2) Enter the second value: ");
		b = input.nextInt();

		System.out.print("3) Enter the third value: ");
		c = input.nextInt();

		System.out.print("4) Enter the fourth value: ");
		d = input.nextInt();

		difference = (a * b - c * d);

		System.out.printf("\n-> The result of the difference calculation ((%d * %d) - (%d * %d)) is %d.\n", a, b, c, d,
				difference);

		input.close();

	}

}