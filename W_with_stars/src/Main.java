import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputDigit = new Scanner(System.in);
        System.out.print("Yıldız kaç satırdan oluşacak : ");

        int girilenDeger = inputDigit.nextInt();

        int x = 1;
        int y = girilenDeger;

        for (int i=0; i < girilenDeger; i++){

            for(int f=0; f < y - girilenDeger ; f++){

                System.out.print(" ");
            }

            System.out.print("***");

            for(int g=0; g < girilenDeger - x ; g++){

                System.out.print(" ");
            }

            for(int g=0; g < girilenDeger - x ; g++){

                System.out.print(" ");
            }

            System.out.print("***");

            for(int f=0; f < y - girilenDeger ; f++){

                System.out.print(" ");
            }

            for(int f=0; f < y - girilenDeger ; f++){

                System.out.print(" ");
            }

            System.out.print("***");

            for(int g=0; g < girilenDeger - x ; g++){

                System.out.print(" ");
            }

            for(int g=0; g < girilenDeger - x ; g++){

                System.out.print(" ");
            }

            System.out.print("***");

            for(int f=0; f < y - girilenDeger ; f++){

                System.out.print(" ");
            }

            x++;
            y++;

            System.out.println();
        }
    }
}