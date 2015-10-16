package by.pvt.ilya;

/**
 * this program prints a string with two spaces between letters and under each
 * letter publishes its number in the alphabet
 * 
 * @author Ilya
 *
 */

public class AlphabetNumber {

	public static void main(String[] args) {
		String text = "I am happy ";
		char[] array = stringWithoutSpase(text);
		print(array);
		figuresInsteadOfLetters(array);

	}

	public static char[] stringWithoutSpase(String s) {
		String textWithoutSpase = s.replaceAll(" ", "");
		char[] arrayS = textWithoutSpase.toCharArray();
		return arrayS;
	}

	public static void print(char[] chr) {
		for (int i = 0; i < chr.length; i++) {
			System.out.print(chr[i] + "  ");
		}
		System.out.println();
	}

	public static void figuresInsteadOfLetters(char[] array) {
		String[] abc = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			abc[i] = Character.toString(array[i]);
		}
		for (int i = 0; i < abc.length; i++) {
			if (abc[i].codePointAt(0) >= 65 && abc[i].codePointAt(0) <= 90) {
				abc[i] = abc[i].toLowerCase();
			}
		}
		for (int i = 0; i < abc.length; i++) {
			System.out.printf("%-3d", (abc[i].codePointAt(0) - 96));
		}

	}

}
