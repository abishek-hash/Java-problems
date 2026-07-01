/*Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n >= 10) {
            int sum = 0;

            while (n > 0) {
                int r = n % 10;
                sum = sum + r;
                n = n / 10;
            }

            n = sum;
        }

        System.out.println(n);
    }
}
