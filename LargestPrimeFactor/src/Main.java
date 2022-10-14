// What is the largest prime factor of the number 600851475143 ?

public class Main {

	public static void main(String[] args) {
		long number = 600851475143L;
		long lastPrime = 0L;
		boolean prime = true;

		for (long i = 2L; i <= number; i++) {

			prime = true;

			for (long j = 2L; j < i; j++) {
				//System.out.println("i :" + i);
				//System.out.println("j :" + j);
				if (i % j == 0) {
					prime = false;

				}
				//System.out.println("last : " + prime);

			}
			if (prime) {
				lastPrime = i;
				
			}
		}
		System.out.println("last : " + lastPrime);
	}

}
