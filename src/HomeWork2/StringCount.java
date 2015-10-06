package HomeWork2;

/**
 * This class creates a variable type String, then method counts how many
 * symbols in the text and divides the text in half. After division two new
 * String variables have to turn out.
 * 
 * @author Илья
 */
public class StringCount {
	static String str = "Витя, буксони";

	public static void main(String args[]) {

		int i = str.length();
		System.out.println(i);
		String str2 = str.substring(0, i / 2);
		String str3 = str.substring(i / 2, i);
		System.out.println(str2);
		System.out.println(str3);

	}

}