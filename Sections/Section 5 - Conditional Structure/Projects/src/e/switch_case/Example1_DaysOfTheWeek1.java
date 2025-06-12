package e.switch_case;

import java.util.Scanner;

public class Example1_DaysOfTheWeek1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Variable declaration
		int weekDay;
		String dayName;
		
		// Data input
		System.out.println("*** Day Of The Week ***\n");
		do {
			System.out.print("Enter the day of the week (e.g.: 1 - Sunday, 2 - Monday, ..., 7 - Saturday): ");
			weekDay = input.nextInt();
			
			if (weekDay <= 0 || weekDay > 7) {
				System.out.println("\n-> Invalid date number. Enter a number between 1 and 7, including.\n");
			}
			
		} while(weekDay <= 0 || weekDay > 7);
		
		// Processing
		if(weekDay == 1) {
			dayName = "Sunday";
		} else if (weekDay == 2) {
			dayName = "Monday";
		} else if (weekDay == 3) {
			dayName = "Tuesday";
		} else if (weekDay == 4) {
			dayName = "Wednesday";
		} else if (weekDay == 5) {
			dayName = "Thursday";
		} else if (weekDay == 6) {
			dayName = "Friday";
		} else {
			dayName = "Saturday";
		}
		
		// Data output
		System.out.printf("%n-> Day of the week: %s.%n", dayName);
		
		input.close();

	}

}
