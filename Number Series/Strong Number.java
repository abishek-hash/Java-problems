// Strong Number: 145 1!=1,4!=24,5!=120 ,1+24+45=145  
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = n;
        int sum = 0;

        while (n > 0) {

            int r = n % 10;

            int fact = 1;

            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }

            sum = sum + fact;

            n = n / 10;
        }

        if (sum == m) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}