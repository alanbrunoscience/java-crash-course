package d.mathoperations;

import java.util.Locale;
import java.util.Scanner;

public class Example2_QuadraticEquation {
	private static final double EPSILON = 1e-10;

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		double a, b, c, delta, x1, x2;

		System.out.println("*** Quadratic Equation ***\n");

		System.out.print("1) Enter the value of the quadratic term (ax²): ");
		a = Double.parseDouble(input.nextLine());

		// Handle linear equation case (a = 0)
		if (Math.abs(a) < EPSILON) {
			System.out.println("\n-> This is not a quadratic equation (a = 0).");
			input.close();
			return;
		}

		System.out.print("2) Enter the value of the linear term (bx): ");
		b = Double.parseDouble(input.nextLine());

		System.out.print("3) Enter the value of the linear term (c): ");
		c = Double.parseDouble(input.nextLine());

		delta = Math.pow(b, 2.0) - 4.0 * a * c;

		System.out.println("\n\n*** Result ***\n");
		if (delta > EPSILON) {
			x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("-> The roots of the equation are: %.2f (x1) and %.2f (x2).\n", x1, x2);
		} else if (Math.abs(delta) < EPSILON) {
			x1 = -b / (2.0 * a);
			System.out.printf("-> The root of the equation is: %.2f.\n", x1);
		} else {
			System.out.println("-> There is no real root for this equation.");
		}

		input.close();

	}

}
