package e.exercises_while;

import java.util.Scanner;

public class Exerc2_FindTheQuadrant {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x, y;

		do {
			System.out.print("1) Enter the X-axis coordinate value: ");
			x = input.nextInt();

			System.out.print("2) Enter the Y-axis coordinate value: ");
			y = input.nextInt();

			if (x == 0 || y == 0) {
				System.out.println("\nFinishing the program...");
				break;
			} else {
				if (x > 0 && y > 0) {
					System.out.println("\n-> First quadrant (Q1).\n");
				} else if (x < 0 && y > 0) {
					System.out.println("\n-> Second quadrant (Q2).\n");
				} else if (x < 0 && y < 0) {
					System.out.println("\n-> Third quadrant (Q3).\n");
				} else {
					System.out.println("\n-> Fourth quadrant (Q4).\n");
				}
			}
		} while (!(x == 0 || y == 0));

		input.close();
	}
}