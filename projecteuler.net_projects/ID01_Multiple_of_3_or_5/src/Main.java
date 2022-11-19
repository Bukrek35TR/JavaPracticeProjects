import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int total = Integer.parseInt(br.readLine());
        
        for(int j=0; j<total;j++){
            long sum = 0;
            long number3 = 0;
            long number5 = 0;
            long number15 = 0;
            long number = Long.parseLong(br.readLine().trim());

            for (long i = number-1 ; 0 < i ; i--) {
                if (i % 3 == 0 ) {
                    number3 = i;
                    break;
                }
            }
            for (long i = number-1 ; 5 <= i ; i--) {
                if (i % 5 == 0 ) {
                    number5 = i;
                    break;
                }
            }
            for (long i = number-1 ; 15 <= i ; i--) {
                if (i % 15 == 0 ) {
                    number15 = i;
                    break;
                }
            }
            sum += (number3 * (number3+3))/6;
            sum += (number5 * (number5+5))/10;
            sum -= (number15 * (number15+15))/30;
            
        System.out.println(sum);
        }
    }

}
