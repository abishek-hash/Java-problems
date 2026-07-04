//Palindrome  :121 ----output:121 
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int r=0;
        int m=n;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==m){
            System.out.println("Palindrome:"+m);
            
        }
        else{
            System.out.println("Not a Palindrome:"+m);
            
        }
    }
}
