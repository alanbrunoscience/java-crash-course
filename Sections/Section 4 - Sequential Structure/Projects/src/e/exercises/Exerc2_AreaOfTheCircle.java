package e.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exerc2_AreaOfTheCircle {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		// Variables declaration
		double area, radius;

		// Data input
		System.out.println("*** AREA OF THE CIRCLE ***\n");
		System.out.print("1) Enter the radius value, please: ");
		radius = input.nextDouble();

		// Processing
		area = PI * Math.pow(radius, 2.0);

		// Data output
		System.out.printf("\n-> The area of the circle of radius %.2f is %.2f.\n", radius, area);

		input.close();

	}

}