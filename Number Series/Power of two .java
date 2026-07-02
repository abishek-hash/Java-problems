//Power of Two :
//Input: n = 16
//Output: true
//Explanation: 24 = 16
//Input: n = 3
//Output: false


import java.util.*;
public class Main{
    public static void  main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    while(n%2==0){
             n=n/2;
    }
            if(n==1){
                System.out.println("true");
            }
            else{
                if(n<=0)
                System.out.println("false");
            }
            
    }
}
