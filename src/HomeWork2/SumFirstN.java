package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program calculates the sum of the first n of members of a row
 * 
 * @author Илья
 *
 */

public class SumFirstN {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		double n = Double.parseDouble(reader.readLine());
		double sum = 0;
		for (double i = 1; i < n + 1; i++) {
			sum += 1 / i;

		}
		System.out.println(sum);

	}

}
