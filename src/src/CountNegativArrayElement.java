/**
 * This program counts quantity of negative elements of an array.
 * 
 * @author Ilya
 *
 */

public class CountNegativArrayElement {

	public static void main(String[] args) {
		int[] array = new int[] { -5, 4, 3, 8, 5, -9, -2, 5, -6, 10 };
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				count++;
			}
		}
		System.out.printf("%d", count);
	}

}
