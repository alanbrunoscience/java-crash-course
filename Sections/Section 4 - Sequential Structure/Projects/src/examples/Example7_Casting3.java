package examples;

public class Example7_Casting3 {

	public static void main(String[] args) {

		// Variables declaration
		double a;
		int b;

		// Variables Assignment
		a = 5.0;
		// b = a; // ❌ Type mismatch: cannot convert from double to int
		b = (int) a;

		// Data Output
		System.out.println(b); // 5

	}

}
