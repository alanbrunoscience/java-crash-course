package c.datainput;

import java.util.Scanner;

public class Example1_ReadingAWord {

	public static void main(String[] args) {

		// Creating an object of the Scanner class
		Scanner input = new Scanner(System.in);

		// Variable declaration
		String name;

		// Data input
		System.out.print("Enter your full name: ");
		name = input.next(); // Reading just the first word, before the whitespace

		// Data output
		System.out.printf("The name entered was %s.%n", name);

		input.close(); // Closing the input object, releasing the resources it was using.

	}

}
