package HomeWork2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program defines your optimal weight and gives you an advice about your
 * real weight.
 * 
 * @author Илья
 *
 */

public class Weight {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Введите ваш вес в кг");
		int yourRealWeight = Integer.parseInt(reader.readLine());
		System.out.println("Введите ваш рост в см");
		int yourHeight = Integer.parseInt(reader.readLine());
		int yourOptimalWeight = yourHeight - 100;
		if ((yourOptimalWeight - yourRealWeight) == 0) {
			System.out.println("У вас оптимальный вес");
		}
		if ((yourOptimalWeight - yourRealWeight) > 0) {
			System.out.println("Вам нужно потолстеть, дрыщь ты этакий");
		}
		if ((yourOptimalWeight - yourRealWeight) < 0) {
			System.out.println("Вам нужно срочно похудеть, пузанчик");
		}
	}

}