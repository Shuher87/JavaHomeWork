package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program defines your optimal weight and gives you an advice about your
 * real weight.
 * 
 * @author Ilya
 *
 */

public class Weight {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Enter your weight into kg");
		int yourRealWeight = Integer.parseInt(reader.readLine());
		System.out.println("Enter your growth into cm");
		int yourHeight = Integer.parseInt(reader.readLine());
		int yourOptimalWeight = yourHeight - 100;
		if ((yourOptimalWeight - yourRealWeight) == 0) {
			System.out.println("You have an optimum weight");
		}
		if ((yourOptimalWeight - yourRealWeight) > 0) {
			System.out.println("You need to grow stout");
		}
		if ((yourOptimalWeight - yourRealWeight) < 0) {
			System.out.println("You need to lose weight");
		}
	}

}