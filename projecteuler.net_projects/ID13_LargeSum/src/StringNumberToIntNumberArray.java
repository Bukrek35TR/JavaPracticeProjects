
public class StringNumberToIntNumberArray {

	public static int[][] convert(String stringNumber) {
		int charIndex = 0;
		int[][] numberArray = new int[100][50];

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 50; j++) {
				numberArray[i][j] = Integer.parseInt(Character.toString(stringNumber.charAt(charIndex)));
				charIndex++;
			}

		}
		return numberArray;
	}

}
