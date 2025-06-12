package c.data_input;

import java.util.Scanner;

public class Example2_ReadingAnInteger {

	public static void main(String[] args) {

		// Creating the object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Variable declaration
		int number;

		// Data input
		System.out.print("Enter an Integer: ");
		number = input.nextInt();

		// Data output
		System.out.printf("The number entered was %d.%n", number);

		input.close();

	}

}
