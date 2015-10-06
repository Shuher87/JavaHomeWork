package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * this program enters two numbers from the keyboard and then compares them
 * 
 * @author Илья
 *
 */
public class StringCompar {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int numberOne = Integer.parseInt(reader.readLine());
		int numberTwo = Integer.parseInt(reader.readLine());
		if (numberOne > numberTwo) {
			System.out.println(numberOne + " больше " + numberTwo);
		}
		if (numberOne < numberTwo) {
			System.out.println(numberOne + " меньше " + numberTwo);
		}
		if (numberOne == numberTwo) {
			System.out.println("число " + numberOne + " равно " + " числу "
					+ numberTwo);
		}
	}

}
