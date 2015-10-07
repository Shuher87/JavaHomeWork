/**
 * This program multiplies array elements to the first zero
 * 
 * @author Ilya
 *
 */

public class MultiplicationOfElementsToZero {

	public static void main(String[] args) {
		int[] array = new int[] { 2, 5, 8, 9, 0, 7, 5, 45, 6, 8 };
		int mult = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				break;
			}
			mult = mult * array[i];
		}
		System.out.printf("%d", mult);
	}

}
