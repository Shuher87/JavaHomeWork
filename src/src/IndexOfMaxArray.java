/**
 * This program finds the maximum element from the array and an index of this
 * element
 * 
 * @author Ilya
 *
 */

public class IndexOfMaxArray {

	public static void main(String[] args) {
		int[] array = new int[15];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 999);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%-5d", array[i]);// for descriptive reasons
		}
		int max = array[0];
		int max_i = 0;
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				max_i = i;
			}
		}
		System.out.printf("%n");
		System.out.printf("%d%3d", max, max_i);
	}
}
