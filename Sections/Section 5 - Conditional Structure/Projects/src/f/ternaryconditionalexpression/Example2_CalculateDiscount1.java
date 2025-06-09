package f.ternaryconditionalexpression;

import java.util.Locale;
import java.util.Scanner;

public class Example2_CalculateDiscount1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		// Variables declaration
		double price, discount;

		// Data input
		System.out.print("Enter the price: US$ ");
		price = input.nextDouble();

		// Processing
		if (price < 20.0) {
			discount = price * 0.1;
		} else {
			discount = price * 0.05;
		}

		// Data output
		System.out.printf("%n-> The new price is US$ %.2f, and the discount applied was US$ %.2f.%n",
				(price - discount), discount);

		input.close();

	}

}
