package e.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exerc05_PartPrice {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner input = new Scanner(System.in);
		
		// Variables declaration
		int partCode1, partCode2, partsQuantity;
		double partValue, totalPrice = 0;
		
		// Data input
		System.out.println("*** CALCULATE PART PRICE ***\n");
		
		System.out.print("1) Enter the first part code, quantity and the value (e.g.: 12 1 5.30): ");
		partCode1 = input.nextInt();
		partsQuantity = input.nextInt();
		partValue = input.nextDouble();
		
		totalPrice += partsQuantity * partValue;
		
		System.out.print("2) Enter the second part code, quantity and the value (e.g.: 12 1 5.30): ");
		partCode2 = input.nextInt();
		partsQuantity = input.nextInt();
		partValue = Double.parseDouble(input.nextLine());
		
		totalPrice += partsQuantity * partValue;
		
		// Data output
		System.out.printf("\n-> The total price to pay is US$ %.2f.\n", totalPrice);
		
		input.close();

	}

}
