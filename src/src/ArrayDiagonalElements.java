import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * this program removes sequence of elements of the main and collateral diagonal
 * of a matrix of nxn.
 * 
 * @author Ilya
 *
 */
public class ArrayDiagonalElements {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		System.out.println("enter nxn matrix size");
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int n = Integer.parseInt(reader.readLine());

		int[][] array = new int[n][n];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = (int) (Math.random() * 999);
			}
		}
		System.out.println("matrix " + n + "x" + n + ":");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("main diagonal:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == j) {
					System.out.print(array[i][j] + "\t");
				}
			}
		}
		System.out.println();
		System.out.println("the collateral  diagonal:");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
			}
			System.out.print(array[i][array.length - 1 - i] + "\t");
		}

	}

}
