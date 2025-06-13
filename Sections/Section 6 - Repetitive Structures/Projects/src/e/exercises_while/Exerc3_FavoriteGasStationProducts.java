package e.exercises_while;

import java.util.Scanner;

public class Exerc3_FavoriteGasStationProducts {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int countAlcohol = 0, countGasoline = 0, countDiesel = 0, option;
		
		do {
			
			System.out.println("\n*** Favorite Gas Station Products ***\n");
			System.out.print("Choose one of the options below:\n"
					+ "\n1. Alcohol;"
					+ "\n2. Gasoline;"
					+ "\n3. Diesel;"
					+ "\n4. Exit."
					+ "\n\n-> ");
			option = input.nextInt();
			
			while(option < 1 || option > 4) {
				System.out.print("\nInvalid option! Choose one of the options below:\n"
						+ "\n1. Alcohol;"
						+ "\n2. Gasoline;"
						+ "\n3. Diesel;"
						+ "\n4. Exit."
						+ "\n\n-> ");
				option = input.nextInt();
			} 
			
			switch(option) {
				case 1:
					countAlcohol++;
					break;
				case 2:
					countGasoline++;
					break;
				case 3:
					countDiesel++;
					break;
				case 4:
					System.out.println("\nThanks for your participation!");
					break;
			}
			
		} while(option != 4);

		System.out.println("\n*** RESULT ***");
		System.out.printf("%n1. Alcohol: %d;", countAlcohol);
		System.out.printf("%n2. Gasoline: %d;", countGasoline);
		System.out.printf("%n3. Diesel: %d.", countDiesel);
		
		input.close();

	}

}
