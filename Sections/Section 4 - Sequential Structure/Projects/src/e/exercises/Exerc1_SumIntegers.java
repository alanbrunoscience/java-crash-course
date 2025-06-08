package e.exercises;

import java.util.Scanner;

public class Exerc01_SumIntegers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Variables declaration
		int n1, n2, sum = 0;
		
		// Data input
		System.out.println("*** SUM OF INTEGERS ***\n");
		System.out.print("1) Enter the first integer: ");
		n1 = input.nextInt();
		
		System.out.print("2) Enter the second integer: ");
		n2 = input.nextInt();
		
		// Data processing
		sum = n1 + n2;
		
		// Data output
		System.out.printf("\n%d + %d = %d\n", n1, n2, sum);
		
		input.close();

	}

}
