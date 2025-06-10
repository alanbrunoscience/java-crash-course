package h.exercises;

import java.util.Scanner;

public class Exerc3_Multiples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Variables declaration
		int a, b;

		// Data input
		System.out.print("1) Enter an integer number: ");
		a = input.nextInt();

		System.out.print("2) Enter an integer number: ");
		b = input.nextInt();

		// Data output
		if (a >= b && b != 0) {
			System.out.printf((a % b == 0) ? "%n'%d' is a multiple of '%d'.%n" : "%n'%d' is not a multiple of '%d'.%n",
					a, b);
		} else if (b > a && a != 0) {
			System.out.printf((b % a == 0) ? "%n'%d' is a multiple of '%d'.%n" : "%n'%d' is not a multiple of '%d'.%n",
					b, a);
		} else {
			System.out.println("\n-> Cannot check multiples with zero.");
		}

		input.close();

	}

}
