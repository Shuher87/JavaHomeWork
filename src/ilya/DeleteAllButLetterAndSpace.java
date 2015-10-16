package by.pvt.ilya;

/**
 * This program deletes from text all characters except letters and spaces
 * 
 * @author Ilya
 *
 */

public class DeleteAllButLetterAndSpace {

	public static void main(String[] args) {
		String text = "Omg, what are you doing?";
		String[] arrayString = fromStringToArray(text);
		sortString(arrayString);
	}

	public static String[] fromStringToArray(String s) {
		char[] array = s.toCharArray();
		String[] stringArray = new String[array.length];
		for (int i = 0; i < array.length; i++) {
			stringArray[i] = String.valueOf(array[i]);
		}
		return stringArray;
	}

	public static void sortString(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].codePointAt(0) >= 65
					& stringArray[i].codePointAt(0) <= 90
					|| stringArray[i].codePointAt(0) >= 97
					& stringArray[i].codePointAt(0) <= 122
					|| stringArray[i].codePointAt(0) == 32) {
				System.out.print(stringArray[i]);
			}
		}

	}

}
