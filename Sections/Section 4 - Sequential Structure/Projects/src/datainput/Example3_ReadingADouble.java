package datainput;

import java.util.Locale;
import java.util.Scanner;

public class Example3_ReadingADouble {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		// Creating an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Variable declaration
		double number;
		
		// Data input
		System.out.print("Enter a float number: ");
		number = input.nextDouble();
		
		// Data output
		System.out.printf("The number entered was %.2f.%n", number);
		
		input.close();

	}

}
