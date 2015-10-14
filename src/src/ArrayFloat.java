/**
 * This program creates the array from 10 float variables and displays the
 * array. Then calculates an arithmetic average value.
 * 
 * @author Ilya
 *
 */

public class ArrayFloat {

	public static void main(String[] args) {
		float[] array = new float[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (float) Math.random();
		}
		for (int i = 0; i < 10; i++) {
			System.out.printf("%-10.6f", array[i]);

		}
		float sum = 0;
		System.out.println();
		for (int i = 0; i < 10; i++) {
			sum = (sum + array[i]);
		}
		// String s = "average value = ";

		System.out.printf("average value = %f", sum / array.length);

	}

}
