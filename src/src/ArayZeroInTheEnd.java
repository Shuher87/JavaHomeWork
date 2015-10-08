/**
 * this program rearranges all zero in the end of the array
 * 
 * @author Ilya
 *
 */

public class ArayZeroInTheEnd {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 0, 0, 6, 4, 75, 0, 15, 4, 1 };

		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] == 0 && array[j + 1] != 0) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
