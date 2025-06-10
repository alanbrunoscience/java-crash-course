package h.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exerc5_PayableValue {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		// Variables declaration
		int productCode, quantity;
		double totalPrice = 0;

		// Data input
		System.out.print("1) Enter the product code: ");
		productCode = input.nextInt();

		System.out.print("2) Enter the quantity of the product: ");
		quantity = input.nextInt();

		// Processing
		switch (productCode) {
		case 1:
			totalPrice = 4.00 * quantity;
			break;
		case 2:
			totalPrice = 4.50 * quantity;
			break;
		case 3:
			totalPrice = 5.00 * quantity;
			break;
		case 4:
			totalPrice = 2.00 * quantity;
			break;
		case 5:
			totalPrice = 1.50 * quantity;
			break;
		default:
			System.out.println("\n-> Invalid option!");
			break;
		}

		// Data output
		System.out.printf("\n-> The total payable value is US$ %.2f.%n", totalPrice);

		input.close();

	}

}
