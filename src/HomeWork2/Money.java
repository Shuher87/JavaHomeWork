package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program enters a number from the keyboard and writes word У рубльФ in
 * right form.
 * 
 * @author »ль€
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
				System.out.println(i + " рублей");
			} else {
				System.out.println(i + " рубль");
			}
		}
		if (i % 10 > 1 & i % 10 < 5) {
			if (i % 100 > 10 & i % 100 < 20) {
				System.out.println(i + " рублей");
			} else {
				System.out.println(i + " рубл€");
			}
		}
		if (i % 10 > 4 & i % 10 < 10) {
			System.out.println(i + " рублей");
		}
		if (i % 10 == 0) {
			System.out.println(i + " рублей");
		}

	}

}