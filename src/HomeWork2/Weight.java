package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program defines your optimal weight and gives you an advice about your
 * real weight.
 * 
 * @author ����
 *
 */

public class Weight {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("������� ��� ��� � ��");
		int yourRealWeight = Integer.parseInt(reader.readLine());
		System.out.println("������� ��� ���� � ��");
		int yourHeight = Integer.parseInt(reader.readLine());
		int yourOptimalWeight = yourHeight - 100;
		if ((yourOptimalWeight - yourRealWeight) == 0) {
			System.out.println("� ��� ����������� ���");
		}
		if ((yourOptimalWeight - yourRealWeight) > 0) {
			System.out.println("��� ����� ����������, ����� �� ������");
		}
		if ((yourOptimalWeight - yourRealWeight) < 0) {
			System.out.println("��� ����� ������ ��������, ��������");
		}
	}

}