import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Girişi yapılan String kelime, Integer sayı ve Doble sayıları
 * tipine göre adetlerini çıktı olarak verir
 */
public class Main {
	public static void main(String[] argh) throws IOException {

		int countInt = 0;
		int countDouble = 0;
		int countString = 0;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String text = input.readLine();

		//String text = "İzmir 3.5 35 Fatih Yigit 85 35 3.7";

		String[] st = text.split(" ", 10);

		for (String string : st) {
			try {
				Integer.parseInt(string);
				countInt++;
			} catch (Exception e) {
				try {
					Double.parseDouble(string);
					countDouble++;
				} catch (Exception e2) {
					countString++;
				}
			}
		}

		System.out.println("string " + countString);
		System.out.println("integer " + countInt);
		System.out.println("double " + countDouble);

	}
}
