import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		int sum = 0;
		long result =0;
		double pow=9;
		ArrayList<Integer> sumArray = new ArrayList<Integer>();
		Values value = new Values();

		int[][] numberArray = StringNumberToIntNumberArray.convert(value.getStringNumber());

		for (int i = 49; i >= 0; i--) {

			for (int j = 0; j < 100; j++) {
				sum += (numberArray[j][i]);
			}
			sumArray.add(sum % 10);
			sum = sum / 10;

		}
		sumArray.add(sum % 10);
		sum = sum / 10;
		sumArray.add(sum);
		Collections.reverse(sumArray);

		for (int i = 0; i < 10; i++) {
			result += (long) (sumArray.get(i) * (long) Math.pow(10, pow));
			pow--;

		}
		System.out.println(result);

	}

}
