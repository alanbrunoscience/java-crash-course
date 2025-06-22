package utils;

public class TextUtils {
	public static String toTitleCase(String input) {
		if (input == null || input.isEmpty())
			return input;

		String[] words = input.trim().toLowerCase().split("\\s+");
		StringBuilder result = new StringBuilder();

		for (String word : words) {
			result.append(capitalizeSpecialWord(word)).append(" ");
		}

		return result.toString().trim();
	}

	private static String capitalizeSpecialWord(String word) {
		StringBuilder sb = new StringBuilder();
		String[] parts = word.split("(?<=['-])|(?=['-])");

		for (String part : parts) {
			if (part.equals("-") || part.equals("'")) {
				sb.append(part);
			} else if (!part.isEmpty()) {
				sb.append(Character.toUpperCase(part.charAt(0)));
				if (part.length() > 1) {
					sb.append(part.substring(1));
				}
			}
		}

		return sb.toString();
	}
}
