/**
 * This program calculates the sum of elements of an array until the first
 * element is zero
 * 
 * @author Ilya
 *
 */

public class SumElementsToZero {

	public static void main(String[] args) {
		int[] array = new int[] { 4, 8, 6, 45, 8, 0, 9, 7, 4, 7 };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				break;
			}
			sum += array[i];
		}
		System.out.printf("%d", sum);
	}

}
