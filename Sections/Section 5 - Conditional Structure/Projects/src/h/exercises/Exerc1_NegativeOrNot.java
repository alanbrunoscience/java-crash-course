package h.exercises;

import java.util.Scanner;

public class Exerc1_NegativeOrNot {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Variable declaration
		int number;
		
		// Data input
		System.out.print("Enter an integer number: ");
		number = input.nextInt();
		
		// Data output
		System.out.println((number < 0) ? "\n-> Negative!" : "\n-> Not Negative!");
		
		input.close();

	}

}
