package by.pvt.ilya;

/**
 * This program checks whether one line of another row permutation
 * 
 * @author Ilya
 *
 */

public class shiftOfWord {
	static String word1 = "glamur";
	static String word2 = "rumalg";

	public static void main(String[] args) {

		String word3 = new String(arrayBackwards(word2));
		equalsString(word1, word3);
	}

	public static char[] arrayBackwards(String s) {
		char[] array = s.toCharArray();
		char[] arrayBack = new char[array.length];

		for (int i = 0; i < array.length; i++) {
			arrayBack[i] = array[array.length - i - 1];
		}
		return arrayBack;
	}

	public static void equalsString(String firstWord, String secondWord) {
		if (firstWord.equalsIgnoreCase(secondWord)) {
			System.out.printf("string \"%s\" is shift of the string \"%s\"",
					word2, firstWord);
		} else {
			System.out.printf("string \"%s\" isn't shift of the string \"%s\"",
					word2, firstWord);
		}
	}

}
