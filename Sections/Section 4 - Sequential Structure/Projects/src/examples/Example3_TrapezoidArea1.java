package examples;

import java.util.Locale;

public class Example3_TrapezoidArea1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Variables Declaration
		double b, B, h, area;

		// Variables Assignment
		b = 6.0;
		B = 8.0;
		h = 5.0;

		// Trapezoid Area
		area = (b + B) / 2.0 * h;

		// Data Output
		System.out.println(area); // 35.0

	}

}
