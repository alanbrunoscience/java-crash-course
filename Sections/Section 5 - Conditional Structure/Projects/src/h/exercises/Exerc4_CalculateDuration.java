package h.exercises;

import java.util.Scanner;

public class Exerc4_CalculateDuration {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Variables declaration
		int startTime, endTime, duration;
		
		System.out.print("1) Enter the start time of the game: ");
		startTime = input.nextInt();
		
		System.out.print("2) Enter the end time of the game: ");
		endTime = input.nextInt();
		
		// Processing
		if(startTime == endTime) {
			duration = 24;
		} else if(startTime > endTime) {
			duration = 24 - startTime + endTime;
		} else {
			duration = endTime - startTime;
		}
		
		// Data output
		System.out.printf("%n-> The game lasted %d hour(s).", duration);

		input.close();

	}

}
