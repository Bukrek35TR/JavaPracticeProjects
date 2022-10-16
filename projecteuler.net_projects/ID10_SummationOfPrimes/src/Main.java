// Find the sum of all the primes below two million.

public class Main {

	public static void main(String[] args) {
		long value = 2000000L;
		long sum = 0;
		PrimeCalculation primeCalculation = new PrimeCalculation();

		for (long i = 2; i < value; i++) {
			if (primeCalculation.isPrime(i)) {
				sum += i;
			}
		}

		System.out.println("Conclusion : " + sum);
	}
}
