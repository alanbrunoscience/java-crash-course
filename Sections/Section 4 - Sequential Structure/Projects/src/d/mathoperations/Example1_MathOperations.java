package d.mathoperations;

import java.util.Locale;

public class Example1_MathOperations {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double a, b, c;

		a = Math.sqrt(x);
		b = Math.sqrt(y);
		c = Math.sqrt(25.0);

		System.out.printf("1) The square root of %.2f is %.2f;\n", x, a);
		System.out.printf("2) The square root of %.2f is %.2f;\n", y, b);
		System.out.printf("3) The square root of 25 is %.2f;\n", c);

		a = Math.pow(x, y);
		b = Math.pow(x, 2.0);
		c = Math.pow(5.0, 2.0);
		
		System.out.printf("4) %.2f ^ %.2f = %.2f;\n", x, y, a);
		System.out.printf("5) %.2f squared = %.2f;\n", x, b);
		System.out.printf("6) 5 squared = %.2f;\n", c);
		
		a = Math.abs(y);
		b = Math.abs(z);
		
		System.out.printf("7) Absolute value of %.2f is equal to %.2f;\n", y, a);
		System.out.printf("8) Absolute value of %.2f is equal to %.2f.\n", z, b);

	}

}
