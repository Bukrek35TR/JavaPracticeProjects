import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		boolean isReturn = true;

		while (isReturn) {
			boolean isNumber = true;
			boolean isChoice = true;
			int num = 0;
			int x = -1;
			int y = 0;
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			while (isNumber) {
				System.out.print(" 3 ile 24 arasında yükseklik giriniz : ");
				String store = reader.readLine().trim();

				String[] arrayS = store.split(" ");

				for (String string : arrayS) {
					try {
						num = Integer.parseInt(string);
						isNumber = false;
					} catch (Exception e) {
						try {
							num = (int) Math.round(Double.parseDouble(string));
							isNumber = false;
						} catch (Exception e2) {
							System.out.println("Sadece rakam girebilirsiniz.");
						}
					}
				}
				if (!(2 < num && num < 25)) {
					System.out.println("Sadece 3 ile 24 arasında bir değer girebilirsiniz.");
					isNumber = true;
				}
			}

			if (num == 3) {
				y = num;
			} else {
				y = ((num - 3) * 2) + 3;
			}

			for (int i = 0; i < num; i++) {

				System.out.print("*");

				if (i > 1) {
					for (int j = 0; j < x; j++) {
						System.out.print(" ");
					}
				}

				if (i > 0) {
					System.out.print("*");
				}

				for (int j = 0; j < y; j++) {
					System.out.print(" ");
				}

				if (i > 0 && i != num - 1) {
					System.out.print("*");
				}

				if (i > 1) {
					for (int j = 0; j < x; j++) {
						System.out.print(" ");
					}
				}

				System.out.println("*");

				y -= 2;
				x++;
			}

			while (isChoice) {
				System.out.print("Yeni değer ile denemek ister misiniz? (E/H) : ");
				String choice = reader.readLine().trim();

				if (choice.charAt(0) == 'e' || choice.charAt(0) == 'E') {
					isChoice = false;
				} else if (choice.charAt(0) == 'h' || choice.charAt(0) == 'H') {
					isChoice = false;
					isReturn = false;
				} else {
					System.out.println("Yanlış değer girdiniz.");
				}

			}
		}
	}
}
