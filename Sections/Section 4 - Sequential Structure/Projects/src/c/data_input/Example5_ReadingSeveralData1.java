/**
 * Reading several data on the same line 
 */

package c.data_input;

import java.util.Locale;
import java.util.Scanner;

public class Example5_ReadingSeveralData1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		// Creating an object of the Scanner class
		Scanner input = new Scanner(System.in);
		
		// Variables declaration
		String x;
		int y;
		double z;
		
		// Data input
		System.out.print("1) Enter a string, please: ");
		x = input.next();
		
		System.out.print("2) Enter an integer, please: ");
		y = input.nextInt();
		
		System.out.print("3) Enter a float number, please: ");
		z = input.nextDouble();
		
		// Data output
		System.out.printf("1) The string entered was %s;%n", x);
		System.out.printf("2) The integer entered was %d;%n", y);
		System.out.printf("3) The float number entered was %.2f.%n", z);

		input.close();

	}

}

/**
 * Problema do \n (Quebra de Linha)
 * 
 * Quando você usa métodos como nextInt(), nextDouble() ou next(), o Scanner do Java lê o valor digitado, mas não 
 * consome a quebra de linha (\n) que vem depois (gerada quando o usuário pressiona ENTER).
 * 
 * Isso pode causar problemas quando você usa nextLine() em seguida, porque o nextLine() lê tudo até a próxima quebra de
 * linha, e se houver um \n "sobrando" no buffer de entrada, ele será lido imediatamente, fazendo com que o programa 
 * "pule" a próxima entrada.
 * 
 * Para evitar isso, você pode adicionar um input.nextLine() extra depois de nextInt(), nextDouble() ou next(), para
 * "limpar" o \n do buffer.
 * 
 */
