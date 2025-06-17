package c.interesting_methods_for_strings;

import java.util.Arrays;

public class Example2_SplitMethod {

	public static void main(String[] args) {

		String s = "potato apple lemon";

		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];

		System.out.println(Arrays.toString(vect)); // [potato, apple, lemon]
		System.out.println(word1); // potato
		System.out.println(word2); // apple
		System.out.println(word3); // lemon

	}

}
