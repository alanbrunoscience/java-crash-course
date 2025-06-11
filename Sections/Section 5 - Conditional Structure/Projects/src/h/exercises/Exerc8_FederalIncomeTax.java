package h.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exerc8_FederalIncomeTax {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		// Variables declaration
		double salary, incomeTaxValue;

		// Data input
		System.out.println("*** Federal Income Tax Calculation ***\n");
		System.out.print("1) Enter your salary: ");
		salary = input.nextDouble();

		// Processing
		if (salary <= 2000.0) {
			incomeTaxValue = 0.0;
		} else if (salary <= 3000.0) {
			incomeTaxValue = (salary - 2000.0) * 0.08;
		} else if (salary <= 4500.0) {
			incomeTaxValue = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			incomeTaxValue = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		// Data output
		if (incomeTaxValue == 0) {
			System.out.println("\n-> Free.");
		} else {
			System.out.printf("%n-> Income tax payable: US$ %.2f.%n", incomeTaxValue);
		}

		input.close();

	}

}
