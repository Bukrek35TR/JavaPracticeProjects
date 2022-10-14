// What is the largest prime factor of the number 600851475143 ?

public class Main {

	public static void main(String[] args) {
		long number = 600851475143L;
		long lastPrime = 0L;
		boolean prime = true;

		for (long i = number; 0 < i; i--) {

			prime = true;
			for (long j = 2L; j < i; j++) {

				if (i % j == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				lastPrime = i;
				System.out.println("Largest Prime : " + lastPrime);
				return;

			}
		}
	}

}
