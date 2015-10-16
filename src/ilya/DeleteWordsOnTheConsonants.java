package by.pvt.ilya;

/**
 * 
 * @author Ilya
 *
 */

public class DeleteWordsOnTheConsonants {
	static int min = 2;

	public static void main(String[] args) {
		String text = "I am looking for your book";
		selectionText(stringToArray(text));
	}

	public static String[] stringToArray(String str) {
		String[] array = str.split(" ");
		return array;
	}

	public static void selectionText(String[] str) {
		for (int i = 0; i < str.length; i++) {

			if ((str[i].length() != min)) {

				switch ((char) Character.toLowerCase(str[i].charAt(0))) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'y':
					System.out.print(str[i] + " ");
					break;
				}
			}

		}

	}
}
