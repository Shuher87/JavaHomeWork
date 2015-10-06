package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program divides two numbers and returns result
 * 
 * @author Илья
 *
 */

public class Division {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		double numOne = Double.parseDouble(reader.readLine());
		double numTwo = Double.parseDouble(reader.readLine());
		double result = div(numOne, numTwo);
		System.out.println(result);
	}

	public static double div(double x, double y) {
		double c = x / y;
		return c;
	}

}
