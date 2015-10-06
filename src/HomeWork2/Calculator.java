package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * It program enters two numbers from the keyboard and calculates the sum or
 * division of these numbers
 * 
 * @author ����
 *
 */

public class Calculator {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		while (reader != null) {

			System.out.println("������� ������ �����");
			String s1 = reader.readLine();
			double a = Double.parseDouble(s1);

			System.out.println("������� ������ �����");
			String s2 = reader.readLine();
			double b = Double.parseDouble(s2);

			System.out.println("����� ������� ����� ������� +");
			System.out.println("����� ��������� ����� ������� /");
			System.out.println("����� ����� �� ��������� ������� q");
			String k = reader.readLine();

			if (k.equals("+")) {
				System.out.println(a + " + " + b + " = " + sumNum(a, b));
			}
			if (k.equals("/")) {
				System.out.println(a + " / " + b + " = " + divisionNum(a, b));
			}
			if (k.equals("q")) {
				break;
			}

		}
	}

	public static double sumNum(double x, double y) {
		double sum = x + y;
		return sum;
	}

	public static double divisionNum(double x, double y) {
		double div = x / y;
		return div;
	}

}
