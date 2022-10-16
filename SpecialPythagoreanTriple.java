
public class SpecialPythagoreanTriple {

	public boolean isPythagorasTriple(int a, int b, int c) {

		if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2) && a > 0 && b > a && c > b) {
			return true;
		}

		return false;

	}

}