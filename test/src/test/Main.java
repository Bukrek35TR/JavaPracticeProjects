package test;

import java.util.Scanner;

public class Main {
		public static boolean MathCiftmi (long num) {
			if (num%2==0) {
				return true;
			}else {
				return false;
			}
		}
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Sayı giriniz : " );
		
		System.out.println("Çiftmi : " + MathCiftmi(s.nextLong()));


	}
;
}
