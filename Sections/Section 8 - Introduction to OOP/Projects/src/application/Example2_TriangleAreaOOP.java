package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

/**
 * Make a program to read the measurements of the sides of two triangles X and Y
 * (assume valid measurements). Then, show the value of the areas of the two
 * triangles and say which of the two triangles has the largest area.
 * 
 * The formula for calculating the area of ​​a triangle from the measures of its
 * sides a, b and c is as follows (Heron's formula):
 * 
 * area = Math.sqrt(p * (p - a) * (p - b) * (p - c)), where p = (a + b + c) / 2.
 * 
 * P.S.: This program will be developed using the Object-Oriented Programming
 * (OOP) paradigm.
 * 
 */

public class Example2_TriangleAreaOOP {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {

			Triangle x = new Triangle();
			Triangle y = new Triangle();

			// Data input
			System.out.println("*** TRIANGLE X ***");
			dataInput(input, x);

			System.out.println("\n\n*** TRIANGLE Y ***");
			dataInput(input, y);

			// Processing
			double areaX = x.area();
			double areaY = y.area();
			double larger = maxArea(areaX, areaY);

			// Data output
			System.out.println("\n\n*** CALCULATED AREAS ***");
			System.out.printf("%n-> Triangle X area: %.2f;%n", areaX);
			System.out.printf("-> Triangle Y area: %.2f;%n", areaY);
			if (areaX == areaY) {
				System.out.printf("-> The areas are equal: %.2f.%n", areaX);
			} else {
				System.out.printf("-> Larger area: %.2f.%n", larger);
			}

		}

	}

	private static double[] dataInput(Scanner input, Triangle triangle) {

		do {
			for (int i = 0; i < 3; i++) {
				System.out.printf("%n%d) Enter the value of the %s side: ", (i + 1), getOrdinal(i + 1));
				while (!input.hasNextDouble()) {
					System.out.print("\n-> Invalid input. Please enter a numerical value: ");
					input.next(); // discard invalid input
				}
				triangle.sides[i] = input.nextDouble();
			}

			if (!triangle.isValid()) {
				System.out.println(
						"\n-> Invalid triangle! For a valid triangle, the sum of the lengths of any two sides must "
								+ "always be greater than the third side.\nEnter the sides again!");
			}
		} while (!triangle.isValid());

		return triangle.sides;

	}

	private static String getOrdinal(int number) {
		int lastTwoDigits = Math.abs(number % 100); // Get the last 2 digits (considering negative)

		if (lastTwoDigits >= 11 && lastTwoDigits <= 13) {
			return number + "th";
		}

		switch (Math.abs(number % 10)) { // Get the last digit (considering negative)
		case 1:
			return number + "st";
		case 2:
			return number + "nd";
		case 3:
			return number + "rd";
		default:
			return number + "th";
		}
	}

	private static double maxArea(double areaX, double areaY) {

		return Math.max(areaX, areaY);

	}

}
