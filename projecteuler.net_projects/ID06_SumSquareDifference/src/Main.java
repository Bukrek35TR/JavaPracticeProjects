//difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Main {

	static int sumOfConsecutiveIntegers(int number) {
		return (number * (number + 1)) / 2;
	}

	static int sumOfSquares(int number) {
		return (number * (number + 1) * ((2 * number) + 1)) / 6;
	}

	public static void main(String[] args) {
		int number = 100;
		int sumSquare = (int) Math.pow(sumOfConsecutiveIntegers(number), 2);
		int squareSum = sumOfSquares(number);

		System.out.println("Conclusion : " + (sumSquare - squareSum));
	}
}
