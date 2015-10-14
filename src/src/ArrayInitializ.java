import java.io.BufferedReader;

/**
 * This program declares  and initializes array from 15 elements
 * 
 *  @author Ilya
 */

import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayInitializ {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		int[] array1 = new int[] { 1, 5, 9, 45, 12, 78, 5, 26, 41, 28, 0, 78,
				81, 43, 26 };
		int[] array2 = new int[15];
		int[] array3 = new int[15];
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		for (int i = 0; i < 15; i++) {
			array2[i] = Integer.parseInt(reader.readLine());
		}
		for (int i = 0; i < 15; i++) {
			array3[i] = (int) (Math.random() * 10 + 1);
		}

	}

}
