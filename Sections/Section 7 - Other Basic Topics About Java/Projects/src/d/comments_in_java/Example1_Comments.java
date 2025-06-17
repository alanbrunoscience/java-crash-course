package d.comments_in_java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Program Explanation
 * 
 * This program calculates the roots of a quadratic equation;
 * 
 * The coefficient values ​​must be entered one per line.
 * 
 */

public class Example1_Comments {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		try (Scanner input = new Scanner(System.in)) {
			
			double a, b, c, delta;
			
			System.out.println("Enter the coefficient values:");
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			
			delta = b * b - 4 * a * c;
			
			System.out.println("\nDelta: " + delta); // Delta value calculation
			
			// (...)
			
		}

	}

}
