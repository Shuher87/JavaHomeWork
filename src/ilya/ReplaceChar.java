package by.pvt.ilya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program replaces a char on a new char in each word in the text
 * 
 * @author Ilya
 *
 */

public class ReplaceChar {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("enter a char");
		char n = reader.readLine().charAt(0);
		System.out
				.println("enter a letter position in the word for replacement (numeration begins with 0)");
		int t = Integer.parseInt(reader.readLine());
		String text = "Good morning, Planet";
		String[] array = stringToArray(text);
		String[] result = replaceCharAt(array, t, n);
		print(array);

	}

	public static String[] stringToArray(String s) {
		return s.split(" ");
	}

	public static String[] replaceCharAt(String[] array, int pos, char c) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() <= pos) {
				array[i] = array[i];
			} else
				array[i] = array[i].substring(0, pos) + c
						+ array[i].substring(pos + 1);
		}
		return array;
	}

	public static void print(String[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}

}
