package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

/**
 * this program checks year is leap or not
 * 
 * @author »ль€
 *
 */

public class LeapYear {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("¬ведите год");
		int year = Integer.parseInt(reader.readLine());

		if (year % 4 != 0 || year % 100 == 0) {
			if (year % 400 != 0) {

				System.out.println(year + " год невисокосный");
			}
		}
		if (year % 4 == 0) {
			if (year % 400 == 0 | year % 100 != 0) {

				System.out.println(year + " год високосный");
			}
		}
	}
}
