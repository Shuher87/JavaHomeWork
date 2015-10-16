package by.pvt.ilya.abiturient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class creates the array from data on the entrants and through the console
 * menu allows to sort and display the list of entrants depending on their
 * points
 * 
 * @author Ilya
 *
 */

public class Main {
	private static int negativScore = 190;
	private static int lowestPassingScore = 200;
	private static int semi_LowestPassingScore = 195;
	static BufferedReader reader = new BufferedReader(new InputStreamReader(
			System.in));

	/**
	 * this method is starting a point which displays the console menu and
	 * causes other methods
	 * 
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		Abiturient[] abiturient = new Abiturient[5];
		abiturient[0] = new Abiturient(114614, "Nick", "Bing", 186, 7605824);
		abiturient[1] = new Abiturient(114310, "Olga", "Kotova", 210, 2563485);
		abiturient[2] = new Abiturient(114005, "Julia", "Prudnik", 224, 3128521);
		abiturient[3] = new Abiturient(114146, "Ville", "Aldohin", 201, 6564518);
		abiturient[4] = new Abiturient(114586, "Pet", "Koval", 195, 7254861);
		System.out.printf(
				"if you want to see all abiturients of the list press %10d%n",
				1);
		System.out
				.printf("if you want to see  abiturients who doesn't held  press %7d%n",
						2);
		System.out.printf(
				"if you want to see  abiturients who  held  press %14d%n", 3);
		System.out
				.printf("if you want to see  abiturients who have the best score press %d%n",
						4);

		int n = Integer.parseInt(reader.readLine());

		switch (n) {
		case 1:
			showTitle();
			allAbiturients(abiturient);
			break;
		case 2:
			showTitle();
			unsatisfactoryScore(abiturient);
			break;
		case 3:
			showTitle();
			theBestOfTheBest(abiturient);
			break;
		case 4:
			theTopOfTheAbiturients(abiturient);
			break;
		default:
		}

	}

	/**
	 * this method shows the title of the table
	 */
	public static void showTitle() {
		System.out.printf("%-10s", "id:");
		System.out.printf("%-10s", "name");
		System.out.printf("%-10s", "suname");
		System.out.printf("%-10s", "score");
		System.out.printf("%-10s%n", "phone_number");
		System.out
				.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
	}

	/**
	 * This method shows all entrants, whose point is lower than a lowest
	 * passing score
	 * 
	 * @param abiturient
	 */
	public static void unsatisfactoryScore(Abiturient[] abiturient) {
		for (int i = 0; i < abiturient.length; i++) {
			if (abiturient[i].getScore() < negativScore) {
				(abiturient[i]).show();
			}
		}
	}

	/**
	 * This method shows all entrants
	 * 
	 * @param abiturient
	 */
	public static void allAbiturients(Abiturient[] abiturient) {
		for (int i = 0; i < abiturient.length; i++) {
			(abiturient[i]).show();
		}
	}

	/**
	 * This method shows entrants, whose point is higher than a lowest passing
	 * score score
	 * 
	 * @param abiturient
	 */
	public static void theBestOfTheBest(Abiturient[] abiturient) {
		for (int i = 0; i < abiturient.length; i++) {
			if (abiturient[i].getScore() > lowestPassingScore) {
				(abiturient[i]).show();
			}
		}
	}

	/**
	 * 
	 * This method sorts the array by the sum of balls of entrants on decrease
	 * 
	 * @param abiturient
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void theTopOfTheAbiturients(Abiturient[] abiturient)
			throws NumberFormatException, IOException {
		System.out.println("enter a number of abiturients");
		int k = Integer.parseInt(reader.readLine());
		for (int i = abiturient.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (abiturient[j].getScore() < abiturient[j + 1].getScore()) {
					Abiturient tmp = abiturient[j];
					abiturient[j] = abiturient[j + 1];
					abiturient[j + 1] = tmp;
				}
			}
		}
		showTitle();
		for (int i = 0; i < k; i++) {
			(abiturient[i]).show();
		}
	}

}