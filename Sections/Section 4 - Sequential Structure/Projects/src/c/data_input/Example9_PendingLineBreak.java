package c.data_input;

import java.util.Scanner;

public class Example9_PendingLineBreak {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x;
		String s1, s2, s3;

		x = input.nextInt();
		input.nextLine(); // To consume the pending line break

		s1 = input.nextLine();
		s2 = input.nextLine();
		s3 = input.nextLine();

		System.out.println("\n\n*** Entered data ***\n");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		input.close();

	}

}
