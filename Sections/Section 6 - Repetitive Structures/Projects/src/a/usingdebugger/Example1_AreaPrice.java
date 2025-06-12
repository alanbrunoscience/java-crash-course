package a.usingdebugger;

import java.util.Locale;
import java.util.Scanner;

public class Example1_AreaPrice {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		// Variables declaration
		double width, length, squareMeterPrice, area, totalPrice;

		// Data input
		System.out.println("*** Area Price Calculator ***\n");

		System.out.print("1) Enter the width value: ");
		width = input.nextDouble();

		System.out.print("2) Enter the length value: ");
		length = input.nextDouble();

		System.out.print("3) Enter the square meter price: ");
		squareMeterPrice = input.nextDouble();

		// Processing
		area = width * length;
		totalPrice = area * squareMeterPrice;

		// Data output
		System.out.printf("%n-> Area: %.2f;%n", area);
		System.out.printf("-> Amount payable: %.2f.%n", totalPrice);

		input.close();

	}

}
