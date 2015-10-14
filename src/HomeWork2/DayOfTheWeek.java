package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program asks number of a day of the week and returns a name of a day of
 * the week.
 * 
 * @author Ilya
 *
 */

public class DayOfTheWeek {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		System.out.println("Enter a day of the week");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int day = Integer.parseInt(reader.readLine());
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("such day of the week doesn't exist");

		}

	}

}
