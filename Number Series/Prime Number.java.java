import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        if (n <= 1) {
            System.out.println("Not a Prime Number");
            return;
        }
        for (int i= 2; i< n; i++) {
                boolean prime=true;
            for(int j=2;j<i;j++){
                if (i%j == 0) {
                prime=false;
                break;
                }
            }
        if(prime){
             System.out.print(i+" ");
             System.out.println();
              count++;
            }
        }
        System.out.println("Count the Prime Numbers:"+count);
    }
}