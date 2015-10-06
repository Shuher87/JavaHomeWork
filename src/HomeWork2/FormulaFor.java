package HomeWork2;

/**
 * This program displays values of function
 * 
 * @author Илья
 *
 */

public class FormulaFor {

	public static void main(String[] args) {

		double y = 0;
		for (double x = 0; x < 5; x += 0.5) {
			y = 2 * x * x - 5 * x - 8;
			if (y >= -4 & y <= 4) {
				System.out.println(y);
			}
		}
	}
}
