package e.exercises;

import java.util.Locale;
import java.util.Scanner;

public class Exerc4_SalaryCalculation {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);

		// Variables declaration
		int employeeNumber, hoursWorked;
		double hourlyRate, salary;

		// Data input
		System.out.println("*** SALARY CALCULATION ***\n");

		System.out.print("1) Enter the employee number: ");
		employeeNumber = input.nextInt();

		System.out.print("2) Enter the hours worked: ");
		hoursWorked = input.nextInt();

		System.out.print("3) Enter the hourly rate: ");
		hourlyRate = input.nextDouble();

		// Data processing
		salary = hoursWorked * hourlyRate;

		// Data output
		System.out.printf("\nEmployee Number: %d;\n", employeeNumber);
		System.out.printf("Salary: U$ %.2f.", salary);

		input.close();

	}

}