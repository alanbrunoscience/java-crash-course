package c.conditional_structure;

public class Example4_ChainedConditionalStructures2 {

	public static void main(String[] args) {

		int hours = 18;

		if (hours < 12) {
			System.out.println("Good morning!");
		} else if (hours < 18) {
			System.out.println("Good afternoon!");
		} else {
			System.out.println("Good evening!");
		}

	}

}
