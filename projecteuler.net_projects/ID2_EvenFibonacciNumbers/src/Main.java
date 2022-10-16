// Not Exceeding FourMillion

public class Main {

	public static void main(String[] args) {
		int number = 4000000;
		int sum = 0;
		int a = 1;
		int b =2;
		int c =0;
		
		while (b<number) {
			
			if(b%2==0) {
				sum += b;
			}
			
			c = b;
			b += a;
			a = c;

		}
		
		System.out.println("Conclusion : "+sum);
	
	}

}
