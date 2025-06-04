package b.dataprocessing;

import java.util.Locale;

public class Example4_TrapezoidArea2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Variables Declaration
		float b, B, h, area;

		// Variables Assignment
		b = 6f;
		B = 8f;
		h = 5f;

		// Trapezoid Area
		area = ((b + B) / 2f * h);

		// Data Output
		System.out.println(area); // 35.0

	}

}
