package HomeWork2;

/**
 * this program determines a day of the week by a formula and return: 1 -
 * Monday, 2 - Tuesday...
 * 
 * @author »ль€
 *
 */
public class Formula {
	public static void main(String[] args) {

		int d = 4; // число мес€ца
		int m = 8; // номер мес€ца (март Ч 1,)
		int Y = 2015;// номер √ода
		int c = 20; // количество столетий

		int result = (d + (int) ((13 * m - 1) / 5) + Y + (int) (Y / 4)
				+ (int) (c / 4) - 2 * c + 777) % 7;

		System.out.println(result);

	}

}
