package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program enters a number from the keyboard and writes word � ������ in
 * right form.
 * 
 * @author ����
 *
 */

public class Money {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int i = Integer.parseInt(reader.readLine());

		if (i % 10 == 1) {
			if (i % 100 > 10 & i % 100 < 20) {
				System.out.println(i + " ������");
			} else {
				System.out.println(i + " �����");
			}
		}
		if (i % 10 > 1 & i % 10 < 5) {
			if (i % 100 > 10 & i % 100 < 20) {
				System.out.println(i + " ������");
			} else {
				System.out.println(i + " �����");
			}
		}
		if (i % 10 > 4 & i % 10 < 10) {
			System.out.println(i + " ������");
		}
		if (i % 10 == 0) {
			System.out.println(i + " ������");
		}

	}

}