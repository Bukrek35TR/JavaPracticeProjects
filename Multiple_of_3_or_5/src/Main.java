
public class Main {

	public static void main(String[] args) {
		int number = 1000;
		int sum = 0;
		
		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("Sonuç : " + sum);

	}

}
