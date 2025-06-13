package f.exercises_for;

import java.util.Scanner;

public class Exerc2_InOrOutOfRange2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the quantity of numbers to check: ");
        int totalNumbers = getValidInt(input);

        // Early exit if no numbers to process
        if (totalNumbers <= 0) {
            System.out.println("\nNo numbers to check. Exiting...");
            input.close();
            return;
        }

        int countIn = 0, countOut = 0;

        for (int i = 0; i < totalNumbers; i++) {
            System.out.printf("\nEnter the %s integer: ", getOrdinal(i + 1));
            int num = getValidInt(input);

            if (num >= 10 && num <= 20) {
                countIn++;
            } else {
                countOut++;
            }
        }

        System.out.println("\n\n*** Numbers In/Out of Range [10, 20] ***");
        System.out.printf("-> In range: %d numbers%n", countIn);
        System.out.printf("-> Out of range: %d numbers%n", countOut);

        input.close();
    }

    // Helper method: Ensures input is a valid integer
    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("\nInvalid input! Please enter an INTEGER: ");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }

    // Helper method: Converts number to ordinal (1st, 2nd, 3rd, etc.)
    private static String getOrdinal(int number) {
        if (number >= 11 && number <= 13) {
            return number + "th";
        }
        switch (number % 10) {
            case 1:  return number + "st";
            case 2:  return number + "nd";
            case 3:  return number + "rd";
            default: return number + "th";
        }
    }
}