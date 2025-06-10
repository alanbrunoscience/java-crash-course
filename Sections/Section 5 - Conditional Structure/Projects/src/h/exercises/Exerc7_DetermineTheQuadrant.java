package h.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exerc7_DetermineTheQuadrant {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		// Variables declaration
		double x, y;

		// Data input
		System.out.print("1) Enter the first coordinate (x): ");
		x = input.nextDouble();

		System.out.print("2) Enter the second coordinate (y): ");
		y = input.nextDouble();

		// Data output
		if (x == 0.0 && y == 0.0) {
			System.out.println("\n-> Origin");
		} else if (x == 0.0) {
			System.out.println("\n-> Y axis");
		} else if (y == 0.0) {
			System.out.println("\n-> X axis");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("\n-> Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("\n-> Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("\n-> Q3");
		} else {
			System.out.println("\n-> Q4");
		}

		input.close();

	}

}
