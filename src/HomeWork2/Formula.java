package HomeWork2;

/**
 * this program determines a day of the week by a formula and return: 1 -
 * Monday, 2 - Tuesday...
 * 
 * @author ����
 *
 */
public class Formula {
	public static void main(String[] args) {

		int d = 4; // ����� ������
		int m = 8; // ����� ������ (���� � 1,)
		int Y = 2015;// ����� ����
		int c = 20; // ���������� ��������

		int result = (d + (int) ((13 * m - 1) / 5) + Y + (int) (Y / 4)
				+ (int) (c / 4) - 2 * c + 777) % 7;

		System.out.println(result);

	}

}
