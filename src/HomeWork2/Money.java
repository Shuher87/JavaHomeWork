package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program enters a number from the keyboard and writes word “ rubl” in
 * right form.
 * 
 * @author Ilya
 *
 */

public class Money {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int i = Integer.parseInt(reader.readLine());

		if (i % 10 == 1) {
			if (i % 100 > 10 & i % 100 < 20) {
				System.out.println(i + " rublej");
			} else {
				System.out.println(i + " rubl");
			}
		}
		if (i % 10 > 1 & i % 10 < 5) {
			if (i % 100 > 10 & i % 100 < 20) {
				System.out.println(i + " rublej");
			} else {
				System.out.println(i + " rublya");
			}
		}
		if (i % 10 > 4 & i % 10 < 10) {
			System.out.println(i + " rublej");
		}
		if (i % 10 == 0) {
			System.out.println(i + " rublej");
		}

	}

}