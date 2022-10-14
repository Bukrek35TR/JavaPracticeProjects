// What is the largest prime factor of the number 600851475143 ?

public class Main {

	public static void main(String[] args) {
		long number = 600851475143L;
		long primeMultiply = 1L;

		long prime = 2L;
		long i = number;
		while (number != primeMultiply) {
			
			if (i % prime == 0) {
				i /= prime;
				primeMultiply *= prime;
			} else {
				prime++;
			}
		}
		System.out.println("Largest Prime : " + prime);
	}
}
