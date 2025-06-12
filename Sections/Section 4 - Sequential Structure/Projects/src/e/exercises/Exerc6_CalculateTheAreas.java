package e.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exerc6_CalculateTheAreas {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		// Variable declaration
		double a, b, c;

		// Data input
		System.out.println("*** CALCULATE THE AREAS ***\n");

		System.out.print("1) Enter the value of A: ");
		a = input.nextDouble();

		System.out.print("2) Enter the value of B: ");
		b = input.nextDouble();

		System.out.print("3) Enter the value of C: ");
		c = input.nextDouble();

		// Data output
		System.out.printf("\n- Triangle Area: %.3f;", ((a * c) / 2));
		System.out.printf("\n- Circle Area: %.3f;", (PI * Math.pow(c, 2.0)));
		System.out.printf("\n- Trapezoid Area: %.3f;", (a + b) * c / 2.0);
		System.out.printf("\n- Area Of The Square: %.3f;", Math.pow(b, 2.0));
		System.out.printf("\n- Area Of The Rectangle: %.3f.\n", a * b);

		input.close();

	}

}