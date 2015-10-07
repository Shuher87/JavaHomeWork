/**
 * This program finds the minimum element from the array and an index of this
 * element
 * 
 * @author Илья
 *
 */

public class IndexOfMinArray {

	public static void main(String[] args) {
		int[] array = new int[15];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 999);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%-5d", array[i]);// for descriptive reasons
		}
		int min = array[0];
		int min_i = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				min_i = i;
			}
		}
		System.out.printf("%n");
		System.out.printf("%d%3d", min, min_i);
	}
}
