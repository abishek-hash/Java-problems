import java.util.*;
public class Main{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int r=0;
        while(n!=1 && n!=4){
            sum=0;
        
        while(n>0){
            r=n%10;
            sum=sum+(r*r);
            n=n/10;
        }
        n=sum;
        }
        if(n==1){
            System.out.println("true:"+n);
        }
        else{
            System.out.println("false:"+n);
        }
    }
}