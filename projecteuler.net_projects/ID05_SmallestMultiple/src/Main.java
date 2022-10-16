
public class Main {

	public static void main(String[] args) {
		boolean divisible = false;
		int number = 0;

		while (!divisible) {
			number++;
			divisible = true;
			for (int i = 1; i <= 20; i++) {
				if (number % i != 0) {
					divisible = false;
					break;
				}
			}
		}
		if (divisible) {
			System.out.println("Conclusion : " + number);
			return;
		}
	}
}
