package datainput;

import java.util.Scanner;

public class Example8_ReadingUntilLineBreak {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String s1, s2, s3;
		
		System.out.print("1) Enter the first string: ");
		s1 = input.nextLine();
		
		System.out.print("2) Enter the second string: ");
		s2 = input.nextLine();
		
		System.out.print("3) Enter the third string: ");
		s3 = input.nextLine();

		System.out.println("\n\n*** Entered data ***\n");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		input.close();

	}

}
