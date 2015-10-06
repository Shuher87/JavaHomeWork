package HomeWork2;

/**This program calculates the sum of numbers from 1 to n
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumN {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int num = Integer.parseInt(reader.readLine());
		int sum = 0;
		for (int i = 1; i < num + 1; i++) {
			sum += i;
		}
		System.out.print(sum);
	}

}
