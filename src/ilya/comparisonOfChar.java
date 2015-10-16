package by.pvt.ilya;

/**
 * This program determines whether all the characters in the string occur once
 * 
 * @author Ilya
 *
 */

public class comparisonOfChar {

	public static void main(String[] args) {
		String text = "hello";
		char[] array = text.toCharArray();
		int count = 0;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j])
					count++;
			}
		}

		if (count > 0) {
			System.out
					.println("not all the characters in the string meet one time");
		} else {
			System.out
					.println("all the characters in the string meet one time");
		}
	}

}
