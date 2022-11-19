
public class CalculateDivisors {

	public static int divisors(int number) {
		int sum = 0;
		
		for (int i = 2; i < number; i++) {
			while (number % i == 0) {
				number /= i;
				sum++;
			}
		}
		return sum;
	}
}
