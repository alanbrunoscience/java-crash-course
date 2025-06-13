package e.exercises_while;

import java.util.Scanner;

public class Exerc1_PasswordValidator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Variables declaration
		int correctPassword = 2002, password;

		// Data input
		System.out.print("Enter the password: ");
		password = input.nextInt();

		while (password != correctPassword) {
			System.out.print("\n-> Invalid password! Enter the password again: ");
			password = input.nextInt();
		}

		// Data output
		System.out.println("\nAccess allowed! You are welcome. :)");

		input.close();

	}

}
