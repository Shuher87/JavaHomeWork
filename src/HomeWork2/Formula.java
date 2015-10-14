package HomeWork2;

/**
 * this program determines a day of the week by a formula and return: 1 -
 * Monday, 2 - Tuesday...
 * 
 * @author Ilya
 *
 */
public class Formula {
	public static void main(String[] args) {

		int d = 4; // date
		int m = 8; // number of month (March — 1,)
		int Y = 2015;// number of year
		int c = 20; // quantity of centuries

		int result = (d + (int) ((13 * m - 1) / 5) + Y + (int) (Y / 4)
				+ (int) (c / 4) - 2 * c + 777) % 7;

		System.out.println(result);

	}

}
