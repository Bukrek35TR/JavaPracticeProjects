
public class Calculate {

	public static long leftAndRight(int[][] array) {

		long result = 0;

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 17; j++) {
				long multiplicationResult = multiple(array[i][j], array[i][j + 1], array[i][j + 2], array[i][j + 3]);
				if (multiplicationResult > result) {
					result = multiplicationResult;
				}
			}
		}

		return result;

	}

	public static long upAndDown(int[][] array) {

		long result = 0;

		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 17; j++) {
				long multiplicationResult = multiple(array[j][i], array[j + 1][i], array[j + 2][i], array[j + 3][i]);
				if (multiplicationResult > result) {
					result = multiplicationResult;
				}
			}
		}

		return result;

	}

	public static long rightDiagonally(int[][] array) {

		long result = 0;

		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 17; j++) {
				long multiplicationResult = multiple(array[i][j], array[i + 1][j + 1], array[i + 2][j + 2],
						array[i + 3][j + 3]);
				if (multiplicationResult > result) {
					result = multiplicationResult;
				}
			}
		}

		return result;

	}

	public static long leftDiagonally(int[][] array) {

		long result = 0;

		for (int i = 0; i < 17; i++) {
			for (int j = 19; j > 2; j--) {
				long multiplicationResult = multiple(array[i][j], array[i + 1][j - 1], array[i + 2][j - 2],
						array[i + 3][j - 3]);
				if (multiplicationResult > result) {
					result = multiplicationResult;
				}
			}
		}

		return result;

	}

	public static long multiple(int num1, int num2, int num3, int num4) {
		long result = (long) num1 * num2 * num3 * num4;
		return result;

	}
}
