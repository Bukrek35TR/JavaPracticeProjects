
public class Main {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (!(CalculateDivisors.divisors(sum) >= 500)) {
			sum += i;
			i++;
		}
		System.out.println("Conclusion : " + sum);

	}

}
