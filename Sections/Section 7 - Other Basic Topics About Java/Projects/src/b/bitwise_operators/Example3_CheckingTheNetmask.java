package b.bitwise_operators;

import java.util.Scanner;

public class Example3_CheckingTheNetmask {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int mask = 0b100000; // 32 or 0b100000 (0b represents a binary number. I can ignore the leading zeros).
			int n = sc.nextInt();

			if ((n & mask) != 0) {
				System.out.println("6th bit is true!");
			} else {
				System.out.println("6th bit is false");
			}

		}

	}

}
