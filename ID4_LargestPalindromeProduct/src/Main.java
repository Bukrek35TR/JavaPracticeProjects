
public class Main {

	public static void main(String[] args) {
		int digit1, digit2, digit3, digit4, digit5, digit6 = 0;
		int multiply, result = 0;

		for (int i = 100; i < 1000; i++) {

			for (int j = 100; j < 1000; j++) {
				multiply = i * j;
				if (multiply / 100000 == 0) {
					digit5 = multiply / 10000;
					digit4 = (multiply / 1000) % 10;
					digit3 = (multiply / 100) % 10;
					digit2 = (multiply / 10) % 10;
					digit1 = multiply % 10;

					if (digit5 == digit1 && digit4 == digit2 && multiply > result) {
						result = multiply;
					}

				} else {
					digit6 = multiply / 100000;
					digit5 = (multiply / 10000) % 10;
					digit4 = (multiply / 1000) % 10;
					digit3 = (multiply / 100) % 10;
					digit2 = (multiply / 10) % 10;
					digit1 = multiply % 10;

					if (digit6 == digit1 && digit5 == digit2 && digit4 == digit3 && multiply > result) {
						result = multiply;
					}
				}
			}
		}
		System.out.println("Conclusion : " + result);
	}
}
