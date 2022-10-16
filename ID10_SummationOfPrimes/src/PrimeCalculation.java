
public class PrimeCalculation {
	public boolean isPrime(long number) {

		if (number == 1) {
			return false;
		}
		if (number < 1) {
			return false;
		}
		for (long i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
