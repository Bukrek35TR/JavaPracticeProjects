
public class Main {

	public static void main(String[] args) {

		for (int a = 1; a < 1000; a++) {

			for (int b = 1; b < 1000; b++) {
				int c = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
				if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) && a > 0 && b > a && c > b) {

					if ((a + b + c) == 1000) {
						System.out.println("a = " + a);
						System.out.println("b = " + b);
						System.out.println("c = " + c);
						System.out.println("a+b+c = " + (a + b + c));
						System.out.println("-------------------");
						System.out.println("Conclusion (a*b*c) = " + (a * b * c));
						return;
					}
				}
			}
		}
	}
}
