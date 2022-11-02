
public class Main {

	public static void main(String[] args) {
		Values value = new Values();

		int[] numberArray = StringNumberToIntNumberArray.convert(value.getStringNumber());

		System.out.println(numberArray);
	}

}
