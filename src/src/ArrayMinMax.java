/**
 * This program creates the array from 10 integer variables and calculates the
 * maximum and minimum value of the array.
 * 
 * @author Илья
 *
 */

public class ArrayMinMax {

	public static void main(String[] args) {
		int[] array = { 3, 8, 12, 5, 86, 45, 21, 47, 15, 64 };

		int min = array[0];
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		String s = "min value =";
		System.out.printf("%11s%3d%n", s, min);
		System.out.printf("%11s%3d", s, max);
	}
}