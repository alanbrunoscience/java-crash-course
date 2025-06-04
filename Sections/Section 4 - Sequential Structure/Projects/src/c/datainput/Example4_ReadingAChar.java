package c.datainput;

import java.util.Scanner;

public class Example4_ReadingAChar {

	public static void main(String[] args) {

		// Creating an object of the Scanner class
		Scanner input = new Scanner(System.in);
		
		// Variable declaration
		char x;
		
		// Data input
		System.out.print("Enter a char: ");
		x = input.next().charAt(0);
		
		// Data output
		System.out.printf("The char entered was %c.%n", x);
		
		input.close();

	}

}
