// What is the largest prime factor of the number 600851475143 ?

public class Main {

	public static void main(String[] args) {
		long number = 600851475143L;
		long lastPrime = 0L;
		boolean prime = true;


		for (long i = 2L; i <= number; i++) {
			//System.out.println("i :"+i);

			for (long j = 2L; j < i; j++) {
				
				prime = true;
				if (i % j == 0) {
					prime = false;
				}
				if(prime) {
					lastPrime = j;
				}
				//System.out.println("j :"+j);

			}
			
			System.out.println("last : "+lastPrime);
		}
		
		

	}

}
