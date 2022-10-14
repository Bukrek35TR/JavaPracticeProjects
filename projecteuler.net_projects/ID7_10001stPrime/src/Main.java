
public class Main {

	public static void main(String[] args) {
		int number = 10001;
		boolean isPrime = true;
		int primeValue = 0;
		int prime = 1;
		int i = 2;
		
		while (prime <= number) {
			isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				prime++;
				primeValue = i;
			}
			i++;
		}
		System.out.println("Conclusion : " + primeValue);
	}
}
