import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/* Sadece String olarak girişi yapılan kelimelerin arasındaki boşlukları kaldırır
 * ve bütün harfler bitişik yazdırılır
 * 
 * Sadece Integer olarak girilen rakamların arasındaki boşuklar kaldırılır
 * ve bütün rakamlar kendi arasında toplanarak yazdırılır
 */
public class Main {

	public static void sum(List<Integer> array) {
		int sum = 0;
		for (Integer integer : array) {
			sum += integer;
		}
		System.out.println(sum);
	}

	public static void sum(String[] array) {
		String sum ="";
		for (String string : array) {
			sum += string;
		}
		System.out.println(sum);
	}

	public static void main(String[] argh) throws IOException {

		int countInt = 0;
		int countString = 0;
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String text = input.readLine();

		List<Integer> arraytInt = new ArrayList<Integer>();

		String[] arrayString = text.split(" ", 100);

		for (String string : arrayString) {
			try {
				arraytInt.add(Integer.parseInt(string));
				countInt++;
			} catch (Exception e) {
				countString++;
			}
		}

		if (countInt > 0 && countString == 0) {
			sum(arraytInt);
		} else if (countInt == 0 && countString > 0) {
			sum(arrayString);
		} else {
			System.out.println("Kelime ve sayı karışık girilmiş, "
					+ "sadece kelimeler ya da integer sayı giriş yapınız.");
		}

	}
}
