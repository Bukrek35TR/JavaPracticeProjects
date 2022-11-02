
public class StringNumberToIntNumberArray {

	public static int[] convert(String stringNumber) {

		int[] numberArray = new int[stringNumber.length()];

		for (int i = 0; i < stringNumber.length(); i++) {
			numberArray[i] = Integer.parseInt(Character.toString(stringNumber.charAt(i)));
		}
		return numberArray;
	}

}
