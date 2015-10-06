package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * this program calculates a factorial of the number entered from the keyboard.
 * 
 * @author Илья
 *
 */
public class FactorialN {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int n = Integer.parseInt(reader.readLine());
		long factorial = 1;
		if (n == 0) {
			factorial = 1;
		} else {
			for (long i = 1; i < n + 1; i++) {
				factorial *= i;
			}
		}
		System.out.println(factorial);
	}
}
