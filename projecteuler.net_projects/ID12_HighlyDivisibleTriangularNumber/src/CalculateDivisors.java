
public class CalculateDivisors {

	public static int divisors(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum++;
			}
		}
		return sum;
	}
}
